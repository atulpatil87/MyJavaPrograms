import burp.*;

public class XssScanner implements IBurpExtender, IScannerCheck {
    private IBurpExtenderCallbacks callbacks;

    // Implement the IBurpExtender interface
    @Override
    public void registerExtenderCallbacks(IBurpExtenderCallbacks cb) {
        // keep a reference to our callbacks object
        callbacks = cb;

        // set our extension name
        callbacks.setExtensionName("XSS Scanner");

        // register ourselves as a custom scanner check
        callbacks.registerScannerCheck(this);
    }

    // Implement the IScannerCheck interface
    @Override
    public List<IScanIssue> doPassiveScan(IHttpRequestResponse baseRequestResponse) {
        // create an empty list for issues
        List<IScanIssue> issues = new ArrayList<>();

        // get the URL of the request
        URL requestUrl = helpers.analyzeRequest(baseRequestResponse).getUrl();

        // check the response for potential XSS vulnerabilities
        String response = helpers.bytesToString(baseRequestResponse.getResponse());
        if (responseContainsXssVulnerability(response)) {
            // if a vulnerability is found, create a new issue
            issues.add(new CustomScanIssue(
                baseRequestResponse.getHttpService(),
                requestUrl,
                baseRequestResponse,
                "Possible XSS vulnerability",
                "The response contains a potentially malicious script that may be used to exploit an XSS vulnerability.",
                "High"));
        }

        // return the list of issues
        return issues;
    }

    private boolean responseContainsXssVulnerability(String response) {
        // perform some basic checks to determine if the response may contain an XSS vulnerability
        return response.contains("<script>") || response.contains("onload=");
    }

    // Custom implementation of the IScanIssue interface
    private class CustomScanIssue implements IScanIssue {
        private IHttpService httpService;
        private URL url;
        private IHttpRequestResponse requestResponse;
        private String name;
        private String detail;
        private String severity;

        public CustomScanIssue(
            IHttpService httpService,
            URL url,
            IHttpRequestResponse requestResponse,
            String name,
            String detail,
            String severity) {
            this.httpService = httpService;
            this.url = url;
            this.requestResponse = requestResponse;
            this.name = name;
            this.detail = detail;
            this.severity = severity;
        }

        @Override
        public URL getUrl() {
            return url;
        }

        @Override
        public String getIssueName() {
            return name;
        }

        @Override
        public int getIssueType() {
            return 0;
        }

        @Override
        public String getSeverity() {
            return severity;
        }

        @Override
        public String getConf

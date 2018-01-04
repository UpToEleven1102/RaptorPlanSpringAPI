package com.raptorplan.raptorplan.model.response;


import org.json.JSONObject;

public class McTemplateResponse {
    private JSONObject jsonObject;

    public McTemplateResponse(JSONObject jsonObject) {
        this.jsonObject = jsonObject;
    }

    public McTemplateResponse() {
    }

    public JSONObject getJsonObject() {
        return jsonObject;
    }

    public void setJsonObject(JSONObject jsonObject) {
        this.jsonObject = jsonObject;
    }
}

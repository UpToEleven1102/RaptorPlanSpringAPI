package com.raptorplan.raptorplan.model.response;


import org.json.JSONObject;

public class TemplateResponse {
    private JSONObject jsonObject;

    public TemplateResponse(JSONObject jsonObject) {
        this.jsonObject = jsonObject;
    }

    public TemplateResponse() {
    }

    public JSONObject getJsonObject() {
        return jsonObject;
    }

    public void setJsonObject(JSONObject jsonObject) {
        this.jsonObject = jsonObject;
    }
}

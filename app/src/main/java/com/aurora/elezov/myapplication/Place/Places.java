package com.aurora.elezov.myapplication.Place;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by USER on 18.02.2017.
 */

public class Places {
    @SerializedName("html_attributions")
    @Expose
    private List<Object> htmlAttributions = new ArrayList<Object>();
    @SerializedName("next_page_token")
    @Expose
    private String nextPageToken;
    @SerializedName("results")
    @Expose
    private List<Result> results = new ArrayList<Result>();
    @SerializedName("status")
    @Expose
    private String status;


    public void addToListResult(Result result){
        results.add(result);
    }
    /**
     *
     * @return
     * The htmlAttributions
     */
    public List<Object> getHtmlAttributions() {
        return htmlAttributions;
    }

    /**
     *
     * @param htmlAttributions
     * The html_attributions
     */
    public void setHtmlAttributions(List<Object> htmlAttributions) {
        this.htmlAttributions = htmlAttributions;
    }

    /**
     *
     * @return
     * The nextPageToken
     */
    public String getNextPageToken() {
        return nextPageToken;
    }

    /**
     *
     * @param nextPageToken
     * The next_page_token
     */
    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     *
     * @return
     * The results
     */
    public List<Result> getResults() {
        return results;
    }

    /**
     *
     * @param results
     * The results
     */
    public void setResults(List<Result> results) {
        this.results = results;
    }

    /**
     *
     * @return
     * The status
     */
    public String getStatus() {
        return status;
    }

    /**
     *
     * @param status
     * The status
     */
    public void setStatus(String status) {
        this.status = status;
    }
}
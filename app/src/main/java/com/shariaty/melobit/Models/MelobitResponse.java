package com.shariaty.melobit.Models;

import java.util.ArrayList;
import java.util.List;

public class MelobitResponse {
    private Integer total;
    private List<MelobitData> results = new ArrayList<MelobitData>();

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<MelobitData> getResults() {
        return results;
    }
    public void setResults(List<MelobitData> results) {
        this.results = results;
    }
}

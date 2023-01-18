package com.shariaty.melobit;

import com.shariaty.melobit.Models.MelobitData;

import java.util.List;

public interface Request {
    void didFetch(List<MelobitData> list, String status);

    void didError(String status);
}

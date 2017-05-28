package com.job.service;

import com.job.model.CallForViva;


public interface CallForVivaService {

    Iterable<CallForViva> listAllCallForViva();

    CallForViva getCallForVivaById(Integer id);

    CallForViva saveCallForViva(CallForViva callForViva);

    void deleteCallForViva(Integer id);

}

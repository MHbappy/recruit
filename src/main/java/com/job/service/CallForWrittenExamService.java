package com.job.service;

import com.job.model.CallForWrittenExam;

/**
 * Created by User on 5/19/2017.
 */
public interface CallForWrittenExamService {

    Iterable<CallForWrittenExam> listAllCallForWritten();

    CallForWrittenExam getCallForWrittenById(Integer id);

    CallForWrittenExam saveCallForWritten(CallForWrittenExam callForWrittenExam);

    void deleteCallForWritten(Integer id);
}

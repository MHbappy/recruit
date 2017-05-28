package com.job.service;

import com.job.model.CallForWrittenExam;
import com.job.repository.CallForWrittenExamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CallForWrittenExamServiceImpl implements CallForWrittenExamService{


    private CallForWrittenExamRepository callForWrittenExamRepository;

    @Autowired
    public void setCallForWrittenExamRepository(CallForWrittenExamRepository callForWrittenExamRepository) {
        this.callForWrittenExamRepository = callForWrittenExamRepository;
    }

    @Override
    public Iterable<CallForWrittenExam> listAllCallForWritten() {
        return callForWrittenExamRepository.findAll();
    }

    @Override
    public CallForWrittenExam getCallForWrittenById(Integer id) {
        return callForWrittenExamRepository.findOne(id);
    }

    @Override
    public CallForWrittenExam saveCallForWritten(CallForWrittenExam callForWrittenExam) {
        return callForWrittenExamRepository.save(callForWrittenExam);
    }

    @Override
    public void deleteCallForWritten(Integer id) {
        callForWrittenExamRepository.delete(id);
    }
}

package com.chengxusheji.service;

import com.chengxusheji.mapper.DoctorAbsentMapper;
import com.chengxusheji.po.DoctorAbsent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorAbsentService {

    @Autowired
    private DoctorAbsentMapper doctorAbsentMapper;

    public void add(DoctorAbsent doctorAbsent){
        doctorAbsentMapper.add(doctorAbsent);
    }

    public void remove(Integer id){
        doctorAbsentMapper.remove(id);
    }

    public List<DoctorAbsent> findAll(){
        return doctorAbsentMapper.findAll();
    }

    public void removeByDoctorNumber(String doctorNumber) {
        doctorAbsentMapper.removeByDoctorNumber(doctorNumber);
    }

    public List<DoctorAbsent> findAllByDoctorNumber(String doctorNumber) {
        return doctorAbsentMapper.findAllByDoctorNumber(doctorNumber);
    }
}

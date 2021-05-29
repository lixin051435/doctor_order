package com.chengxusheji.mapper;

import com.chengxusheji.po.DoctorAbsent;

import java.util.List;

public interface DoctorAbsentMapper {

    void add(DoctorAbsent doctorAbsent);

    void remove(Integer id);

    List<DoctorAbsent> findAll();

    void removeByDoctorNumber(String doctorNumber);

    List<DoctorAbsent> findAllByDoctorNumber(String doctorNumber);
}

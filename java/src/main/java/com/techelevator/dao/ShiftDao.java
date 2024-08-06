package com.techelevator.dao;

import com.techelevator.model.Shift;

import java.util.List;

public interface ShiftDao {

    Shift getShiftById(int shiftId);
    List<Shift> getAllShift();
    List<Shift> getShiftsByUser(int userId);
    Shift getShiftByEmergency(boolean emergency);

    Shift updateShift(Shift shift);
}

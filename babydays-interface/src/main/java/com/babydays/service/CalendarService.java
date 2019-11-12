package com.babydays.service;

import com.babydays.model.BCalendar;
import com.babydays.model.ListResult;
import com.github.pagehelper.PageInfo;

import java.util.HashMap;

public interface CalendarService {

	void addCalendar(BCalendar calendar) throws Exception;

	void updateCalendar(BCalendar calendar) throws Exception;

	void deleteCalendarById(Integer id) throws Exception;

	ListResult calendarList(HashMap<String, Object> valMap);

	PageInfo<BCalendar> getCalendars(String query, Integer pageNum, Integer pageSize, Integer gardenId) throws Exception;

}

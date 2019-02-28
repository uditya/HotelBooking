package com.cg.service;

import java.util.ArrayList;

import com.cg.dto.BookingDetail;
import com.cg.dto.HotelDetail;

public interface IBookingService {
	public ArrayList<HotelDetail> getAllHotelDetails();
	public HotelDetail findHotel(int id);
	public BookingDetail addBookingDetail(BookingDetail bookingDetails);

}

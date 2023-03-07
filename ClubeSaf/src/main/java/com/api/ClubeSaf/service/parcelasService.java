//package com.api.ClubeSaf.service;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//import com.api.ClubeSaf.model.parcelas;
//import com.api.ClubeSaf.repository.parcelasRepository;
//
//
//@Service
//public class parcelasService {
//
//	@Autowired
//	private parcelasRepository parcelasrepository;
//	
//	@Transactional
//	public parcelas buscarCod(String value) {
//		parcelas result = parcelasrepository.findByCodLin(value);
//		return result;
//	}
//	
//	
//}

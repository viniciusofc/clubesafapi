//package com.api.ClubeSaf.controller;
//
//
//import java.text.ParseException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.transaction.annotation.Transactional;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import com.api.ClubeSaf.model.parcelas;
//import com.api.ClubeSaf.model.updateparcelas;
//import com.api.ClubeSaf.repository.updateParcelasRepository;
//import com.api.ClubeSaf.service.parcelasService;
//
//
//
//@CrossOrigin(origins = "*", allowedHeaders = "*")
//@RestController
//@RequestMapping("/parcelas")
//public class parcelasController {
//
//	@Autowired
//	private parcelasService parcelasservice;
//	
//	@Autowired
//	private updateParcelasRepository updateParcelasrepository;
//
//	@Transactional
//	@GetMapping("/buscar/{value}")
//	public ResponseEntity<parcelas> buscarParcela(@PathVariable String value){
//		parcelas result = parcelasservice.buscarCod(value);
//		return ResponseEntity.ok(result);
//	}
//	
//	@Transactional
//	@PutMapping("/{id}")
//	public ResponseEntity update(@PathVariable Long id, @RequestBody updateparcelas Parcela) {
//	   return updateParcelasrepository.findById(id).map(record -> {
//	               record.setAutenticacao(Parcela.getAutenticacao());
//	               record.setComissao(Parcela.getComissao());
//	               record.setOperacao(Parcela.getOperacao());
//	               record.setIdLocal(Parcela.getIdLocal());
//	               record.setCformpag(Parcela.getCformpag());
//	               record.setIduo(Parcela.getIduo());
//	               try {
//					record.setDatapag(Parcela.getDatapag());
//				} catch (ParseException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
//	               record.setIdUser2(Parcela.getIdUser2());
//	               record.setJuros(Parcela.getJuros());
//				   try {
//					record.setDataOperacao(Parcela.getDataOperacao());
//				} catch (ParseException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//	               updateparcelas updated = updateParcelasrepository.save(record);
//	               return ResponseEntity.ok().body(updated);
//	           }).orElse(ResponseEntity.notFound().build());
//	}
//	
//	
//}

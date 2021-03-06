package kr.opensoftlab.oslits.prj.prj1000.prj1100.service.impl;

import java.util.List;
import java.util.Map;

import kr.opensoftlab.oslits.com.dao.ComOslitsAbstractDAO;

import org.springframework.stereotype.Repository;

@Repository("prj1100DAO")
public class Prj1100DAO  extends ComOslitsAbstractDAO {
	
	/**
	 * 프로세스 목록 조회 
	 * @param paramMap
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	public List selectFlw1000ProcessList(Map paramMap) throws Exception {
		return (List) list("prj1100DAO.selectFlw1000ProcessList", paramMap);
	}
	
	/**
	 * 프로세스 수정 (이름, json데이터)
	 * @param paramMap
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	public void updateFlw1000ProcessInfo(Map paramMap) throws Exception {
		 update("prj1100DAO.updateFlw1000ProcessInfo", paramMap);
	}
	
	/**
	 * 프로세스 추가
	 * @param paramMap
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	public void insertFlw1000ProcessInfo(Map paramMap) throws Exception {
		 insert("prj1100DAO.insertFlw1000ProcessInfo", paramMap);
	}
	
	/**
	 * 프로세스 제거
	 * @param paramMap
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	public void deleteFlw1000ProcessInfo(Map paramMap) throws Exception {
		update("prj1100DAO.deleteFlw1000ProcessInfo", paramMap);
	}

	/**
	 * 프로세스에 배정된 요구사항 수
	 * @param paramMap
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	public int selectFlw1000ProcessReqCnt(Map paramMap) throws Exception {
		return (int) select("prj1100DAO.selectFlw1000ProcessReqCnt", paramMap);
	}
	
	/**
	 * 작업흐름 조회 
	 * @param paramMap
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	public List selectFlw1100FlowList(Map paramMap) throws Exception {
		return (List) list("prj1100DAO.selectFlw1100FlowList", paramMap);
	}
	
	/**
	 * 작업흐름 수정
	 * @param paramMap
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	public void updateFlw1100FlowInfo(Map paramMap) throws Exception {
		 update("prj1100DAO.updateFlw1100FlowInfo", paramMap);
	}
	
	/**
	 * 작업흐름  추가
	 * @param paramMap
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	public void insertFlw1100FlowInfo(Map paramMap) throws Exception {
		 insert("prj1100DAO.insertFlw1100FlowInfo", paramMap);
	}
	
	/**
	 * 작업흐름 제거
	 * @param paramMap
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	public void deleteFlw1100FlowInfo(Map paramMap) throws Exception {
		update("prj1100DAO.deleteFlw1100FlowInfo", paramMap);
	}
	
	/**
	 * 선택 요구사항에 해당하는 추가 항목 목록
	 * @param paramMap
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	public List selectFlw1200ReqOptList(Map paramMap) throws Exception {
		return (List) list("prj1100DAO.selectFlw1200ReqOptList", paramMap);
	}
	
	/**
	 * 선택 작업흐름에 해당하는 추가 항목 목록
	 * @param paramMap
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	public List selectFlw1200OptList(Map paramMap) throws Exception {
		return (List) list("prj1100DAO.selectFlw1200OptList", paramMap);
	}
	
	/**
	 * 해당 항목에 값이 이미 추가되어있는지 확인 
	 * @param paramMap
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	public int selectFlw1200OptCntInfo(Map paramMap) throws Exception {
		 return (int) select("prj1100DAO.selectFlw1200OptCntInfo", paramMap);
	}
	
	/**
	 * 작업흐름 추가항목 수정
	 * @param paramMap
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	public void updateFlw1200OtpInfo(Map paramMap) throws Exception {
		 update("prj1100DAO.updateFlw1200OtpInfo", paramMap);
	}
	
	/**
	 * 작업흐름 추가항목 추가
	 * @param paramMap
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	public void insertFlw1200OtpInfo(Map paramMap) throws Exception {
		 insert("prj1100DAO.insertFlw1200OtpInfo", paramMap);
	}
	
	/**
	 * 작업흐름 추가항목 제거
	 * @param paramMap
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	public void deleteFlw1200OtpInfo(Map paramMap) throws Exception {
		update("prj1100DAO.deleteFlw1200OtpInfo", paramMap);
	}
	
	/**
	 * 작업흐름 추가 항목 입력
	 * @param paramMap
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	public void insertFlw1300OtpValueInfo(Map paramMap) throws Exception {
		 insert("prj1100DAO.insertFlw1300OtpValueInfo", paramMap);
	}
	
	/**
	 * 작업흐름 추가 항목 수정
	 * @param paramMap
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	public void updateFlw1300OtpValueInfo(Map paramMap) throws Exception {
		update("prj1100DAO.updateFlw1300OtpValueInfo", paramMap);
	}
	
	/**
	 * 요구사항 리비전 번호 저장
	 * @param paramMap
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	public void insertFlw1400RevisionNumInfo(Map paramMap) throws Exception {
		insert("prj1100DAO.insertFlw1400RevisionNumInfo", paramMap);
	}
	
	/**
	 * 요구사항 리비전 번호 제거
	 * @param paramMap
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	public void deleteFlw1400RevisionNumInfo(Map paramMap) throws Exception {
		delete("prj1100DAO.deleteFlw1400RevisionNumInfo", paramMap);
	}

	/**
	 * 요구사항별 리비전 목록 가져오기
	 * @param paramMap
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	public List selectFlw1400ReqRevisionNumList(Map paramMap) throws Exception {
		return (List) list("prj1100DAO.selectFlw1400ReqRevisionNumList", paramMap);
	}
	
	/**
	 * 요구사항별 리비전 단건 갯수 가져오기
	 * @param paramMap
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	public int selectFlw1400ReqRevisionNumCnt(Map paramMap) throws Exception {
		return (int) select("prj1100DAO.selectFlw1400ReqRevisionNumCnt", paramMap);
	}

	/**
	 * 작업흐름별 역할제한 정보 저장
	 * @param paramMap
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	public void insertFlw1500FlowAuthGrpInfo(Map paramMap) throws Exception {
		insert("prj1100DAO.insertFlw1500FlowAuthGrpInfo", paramMap);
	}
	/**
	 * 작업흐름별 역할제한 정보 제거
	 * @param paramMap
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	public void deleteFlw1500FlowAuthGrpInfo(Map paramMap) throws Exception {
		delete("prj1100DAO.deleteFlw1500FlowAuthGrpInfo", paramMap);
	}
	
	/**
	 * 작업흐름별 역할제한 정보 목록 가져오기
	 * @param paramMap
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	public List selectFlw1500FlowAuthGrpList(Map paramMap) throws Exception {
		return (List) list("prj1100DAO.selectFlw1500FlowAuthGrpList", paramMap);
	}
	
	/**
	 * 작업흐름별 역할제한 정보 단건 갯수 가져오기
	 * @param paramMap
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	public int selectFlw1500FlowAuthGrpCnt(Map paramMap) throws Exception {
		return (int) select("prj1100DAO.selectFlw1500FlowAuthGrpCnt", paramMap);
	}
}
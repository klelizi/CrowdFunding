package com.redhat.crowdfunding.junit;

import java.util.List;
import java.util.concurrent.ExecutionException;

import org.junit.Test;

import com.redhat.crowdfunding.bean.Fund;
import com.redhat.crowdfunding.service.CrowdFundingServiceImpl;

/**
 * @author littleredhat
 */
public class JCrowd {

	@Test
	public void getFunds() {
		CrowdFundingServiceImpl service = new CrowdFundingServiceImpl();
		System.out.println("getFunds");
		List<Fund> fList;
		try {
			fList = service.getFunds();
			System.out.println(fList);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}

	public void raiseFund() {
		String content = "";
		String password = "";
		CrowdFundingServiceImpl service = new CrowdFundingServiceImpl(password, content);
		System.out.println("raiseFund");
		try {
			boolean res = service.raiseFund("0x...");
			if (res) {
				System.out.println("TRUE");
			} else {
				System.out.println("FALSE");
			}
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}

	public void sendCoin() {
		String content = "";
		String password = "";
		CrowdFundingServiceImpl service = new CrowdFundingServiceImpl(password, content);
		System.out.println("sendCoin");
		try {
			boolean res = service.sendCoin("0x...", 100);
			if (res) {
				System.out.println("TRUE");
			} else {
				System.out.println("FALSE");
			}
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}
}
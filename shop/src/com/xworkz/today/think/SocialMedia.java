package com.xworkz.today.think;

public class SocialMedia {
	public String instagram;
	public String facebook;
	public String whatsapp;
	public String twitter;
	public String thread;
	
	
	public SocialMedia(String instagram,String facebook,String whatsapp,String twitter, String thread) {
		this.instagram=instagram;
		this.facebook=facebook;
		this.whatsapp=whatsapp;
		this.twitter=twitter;
		this.thread=thread;
		
	}
	public String getInstagramName() {
		return instagram;
		
	}
	public void getSocialMedia() {
		System.out.println(this.instagram);
		System.out.println(this.facebook);

		System.out.println(this.whatsapp);

		System.out.println(this.twitter);

		System.out.println(this.thread);

		
	}
	
}

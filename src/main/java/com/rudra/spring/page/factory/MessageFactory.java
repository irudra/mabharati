package com.rudra.spring.page.factory;


import com.rudra.spring.page.value.Message;
import com.rudra.spring.page.value.MessageStore;

public class MessageFactory {
        private MessageStore messageStore= new MessageStore();
    
	private MessageFactory(){
	}
        
	private static MessageFactory messageFactory= new MessageFactory();
        
	public static MessageFactory getFactory(){
		return messageFactory;
	}

	
	public Message getMessage(String pageName, String key){
		Message message = new Message();
                System.out.println( "in message factory"+key);
                if(null !=key){
                    message.setMessage(messageStore.getMessage(pageName,key.trim().toLowerCase()));
                }else{
                    return message;
                }
		
		return message;
	}
}

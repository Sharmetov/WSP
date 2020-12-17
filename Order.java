package wsp;

import java.util.Date;

import java.lang.Comparable ;

public class Order implements Comparator<Order>{
	   private Employee sender;
	    private String topic;
	    private String text;
	    private Process process;
	    private Date dateOfSend;
	    private Executor executor;
	    
	    
	    public Order() {}
	    
	    public Order(String topic, String text ,Process process) {
	    	this() ;
	    	this.topic = topic ;
	    	this.text = text ;
	    	this.process = process ;
	    }
	    public Order(Executor executor,Date dateOfSend) {
	    	this(topic, text, process) ;
	    	this.dateOfSend = dateOfSend;
	    	this.executor = executor;
	    }
	    
	    private Employee getSender() {
	        return this.sender;
	    }
	    private Employee setSender(Employee sender) {
	        this.sender = sender;
	    }
	    private String getTopic() {
	        return this.topic;
	    }
	    private String setTopic(String topic) {
	        this.topic = topic;
	    }
	    private String getText() {
	        return this.text;
	    }
	    private String setText(String text) {
	        this.text = text;
	    }
	    private Process getProcess() {
	        return this.process;
	    }
	    private Process setProcess(Process process) {
	        this.process = process;
	    }
	    private Date getDateOfSend() {
	        return this.dateOfSend;
	    }
	    private Date setDateOfSend(Date dateOfSend) {
	        this.dateOfSend = dateOfSend;
	    }	    
	    
	    
	    public Executor getExecutor() {
	        return this.executor;
	    }
	    
	    public Executor setExecutor(Executor executor) {
	      this.executor = executor;
	    }

	    //                          Operations                                  
	    
	    public boolean accept() {
	        //TODO
	    	try {
	    		return process ;
	    	}
	    	catch(Exception e) {
	    		this.reject(); ;
	    	}
	    }
	    
	    public boolean reject() {
	        //TODO
	        process = false ;
	        return process ;
	    }
	    
	    public void execute() {
	        //TODO
	        //Execute ??? chto dolzhen vivodit typa???;
	    	System.out.println(orders);
	    }
	    
	    public String toString() {
	        //TODO
	        return "Sender: " + sender+ "Topic: " + topic + "text: " + text + "Date of send: " + dateOfSend;
	    }	    
	    
	    
	    
	    public int compareTo(Order anotherOrder) {
	        //TODO
	        return this.process - anotherOrder.process;
	    }

}

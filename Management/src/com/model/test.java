package com.model;

public class test {
	 private int number;
	 private String color;
	 private String name;
	 
	 public void setName(String name)
	 {
		 this.name=name;
	 }
	 public String getName( ) {
		 return name;
	 }
	 
	 public void setColor(String color) {
		 this.color=color;
	 }
	 
	 public String getColor() {
		 return color;
	 }
	 
	 public void setNumber(int number) {
		 this.number=number;
	 }
	 
	 public int getNumber() {
		 return number;
	 }
}
/*<!--<div id="os-Mac-lbl">Switch <span> <s:property value="test[0]"/>%</span></div>
<div id="os-Other-lbl">Server<span>30%</span></div>
<div id="os-test-lbl">Router<span><s:property value="test"/>%</span></div>
<div id="os-test1-lbl">Office equipment<span> 50%</span></div> 
</s:iterator> -->*/
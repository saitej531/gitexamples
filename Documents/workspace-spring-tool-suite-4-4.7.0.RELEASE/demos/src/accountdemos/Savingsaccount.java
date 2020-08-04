package accountdemos;

class Saving extends Account {
	String branchbank;
	Saving(String businessAdd,String name,String branch){
		 super(businessAdd,name);
		this.branchbank=branch;
	}
	public String getBranchbank() {
		return branchbank;
	}
	public void setBranchbank(String branchbank) {
		this.branchbank=branchbank;
	}

}



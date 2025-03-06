package com.enfy.exception.voterageexception;

public class VoterData {
	@Override
	public String toString() {
		return "VoterData [voterid=" + voterid + ", votername=" + votername + ", voterage=" + voterage + "]";
	}

	private int voterid;
	private String votername;
	private int voterage;
	
	
	
	public VoterData(int voterid, String votername, int voterage) {
		super();
		this.voterid = voterid;
		this.votername = votername;
		try
		{
			if(voterage<18)
			{
				InvalidAgeException e= new InvalidAgeException();
				throw e;
				
			}

		}
		catch(InvalidAgeException e)
		{
			e.printStackTrace();
		}

		this.voterage = voterage;
	}
	

	public int getVoterage() {
		return voterage;
	}

	public void setVoterage(int voterage) {
		this.voterage = voterage;
		try
		{
			if(voterage<18)
			{
				InvalidAgeException e= new InvalidAgeException();
				throw e;
				
			}

		}
		catch(InvalidAgeException e)
		{
			e.printStackTrace();
		}
	}

	public VoterData()
	{
		
	}
	
}

package com.zford.jobs.event;


import org.bukkit.entity.Player;

import com.zford.jobs.config.container.JobProgression;
import com.zford.jobs.config.container.PlayerJobInfo;

@SuppressWarnings("serial")
public class JobsLevelUpEvent extends JobsEvent{
	private Player player;
	private JobProgression jobProgression;
	private PlayerJobInfo playerJobInfo;

	public JobsLevelUpEvent(Player player, JobProgression jobProgression, PlayerJobInfo playerJobInfo) {
		super(JobsEventType.LevelUp);
		this.player = player;
		this.jobProgression = jobProgression;
		this.playerJobInfo = playerJobInfo;
		// TODO Auto-generated constructor stub
	}
	
	public Player getPlayer(){
		return player;
	}
	
	public JobProgression getJobProgression(){
		return jobProgression;
	}
	
	public void checkLevels(){
		playerJobInfo.checkLevels();
	}
	
	public int getNumJobs(){
		return playerJobInfo.getJobs().size();
	}

}
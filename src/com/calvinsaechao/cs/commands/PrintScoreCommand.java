package com.calvinsaechao.cs.commands;

import com.calvinsaechao.cs.GameWorld;
import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;

public class PrintScoreCommand extends Command{
	private GameWorld gw;
	public PrintScoreCommand(GameWorld gw) {
		super("Print Score");
		this.gw = gw;
	}
	public void actionPerformed(ActionEvent e) {
		gw.printScore();
	}
}

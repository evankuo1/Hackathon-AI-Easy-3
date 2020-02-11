package gameEngine;

import java.util.ArrayList;
import java.util.List;

import editMe.Player;


public class InitialBoard {
	
	int width;
	int height;
	List<ArrayList> objList;
	
	public InitialBoard() {
		
			width = 3;
			height = 5;
			objList = new ArrayList<ArrayList>();

			BoardObject player = new Player();

			ArrayList playerList = new ArrayList();
			playerList.add(0);
			playerList.add(0);
			playerList.add(player);
			objList.add(playerList);
			
			Food food = new Food();
			ArrayList foodList = new ArrayList();
			foodList.add(2);
			foodList.add(4);
			foodList.add(food);
			objList.add(foodList);
			
			NothingSpace ns1 = new NothingSpace();
			ArrayList ns1List = new ArrayList();
			ns1List.add(0);
			ns1List.add(1);
			ns1List.add(ns1);
			objList.add(ns1List);
			
			NothingSpace ns2 = new NothingSpace();
			ArrayList ns2List = new ArrayList();
			ns2List.add(2);
			ns2List.add(1);
			ns2List.add(ns2);
			objList.add(ns2List);
		}
	
	int getWidth() {
		return width;
	}
	
	int getHeight() {
		return height;
	}
	
	List<ArrayList> getObjList() {
		return objList;
	}
}

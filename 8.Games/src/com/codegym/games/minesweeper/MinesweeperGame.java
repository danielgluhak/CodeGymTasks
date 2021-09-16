package com.codegym.games.minesweeper;

import com.codegym.engine.cell.Game;
import com.codegym.engine.cell.*;

public class MinesweeperGame extends Game {

    private static final int SIDE = 9;

    public void initialize() {
        setScreenSize(SIDE, SIDE);
    }
    public void setScreenSize(int x, int y) {
        int size = x*y;
    }


}

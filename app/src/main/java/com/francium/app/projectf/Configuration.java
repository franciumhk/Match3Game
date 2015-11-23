package com.francium.app.projectf;


public class Configuration {

    public static final float GRID_NUM = 7.0f;
    public static int UNIT_SIZE = (int) (88 * Configuration.GRID_NUM);
    public static int VIEW_WIDTH = 480;
    public static int VIEW_HEIGHT = 800;
    public static int REAL_WIDTH = 480;
    public static int REAL_HEIGHT = 800;
    public static int ADP_SIZE = 0;
    public static float screentRatio = 0;
    public static float translateRatio = 0;
    public static int MOVE_THRESDHOLDER = 5;

    public static int DELAY_MS = 20;
    public static int AWARD_MAX_COUNT = 5;
    public static int MAX_TOKEN = 6;
    public static int NUMBER_OF_BUG = 8;

    public static int AUTOTIP_DELAY = 5 * 1000 / DELAY_MS;
    public static int MAX_TIME = 30;

    public static int BUG_ID_BLANK = 0;
    public static int BUG_ID_BLUE = 1;
    public static int BUG_ID_RED = 2;
    public static int BUG_ID_YELLOW = 3;
    public static int BUG_ID_GREEN = 4;
    public static int BUG_ID_CYAN = 5;
    public static int BUG_ID_PURPLE = 6;
    public static int BUG_ID_WHITE = 7;

    public enum E_SOUND {
        SLIDE,
        FILL,
        DISAPPEAR3,
        DISAPPEAR4,
        DISAPPEAR5,
        READYGO,
        TIMEOVER,
        LEVELUP,
        SUPER,
        COOL,
        GOOD,
        PERFECT,
        SPECIALITEM,
        LIFEADD,
        LIFEDEL,
        INVALID
    }

    public enum E_TIP {
        READYGO,
        LEVELUP,
        GAMEOVER,
    }

    public enum E_SCENARIO {
        MENU,
        GAME,
        RESULT,
    }


}
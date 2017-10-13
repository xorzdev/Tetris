package me.gavin.game.tetris;

import me.gavin.game.tetris.model.shape.I;
import me.gavin.game.tetris.model.shape.J;
import me.gavin.game.tetris.model.shape.L;
import me.gavin.game.tetris.model.shape.O;
import me.gavin.game.tetris.model.shape.S;
import me.gavin.game.tetris.model.shape.Shape;
import me.gavin.game.tetris.model.shape.T;
import me.gavin.game.tetris.model.shape.Z;

/**
 * Utils
 *
 * @author gavin.xiong 2017/10/12
 */
public class Utils {

    public static Shape nextShape() {
        int type = (int) (Math.random() * 7);
        switch (type) {
            case 0:
                return new I(0);
            case 1:
                return new J(0);
            case 2:
                return new L(0);
            case 3:
                return new O();
            case 4:
                return new S(0);
            case 5:
                return new T(0);
            case 6:
                return new Z(0);
            default:
                return new O();
        }
    }
}

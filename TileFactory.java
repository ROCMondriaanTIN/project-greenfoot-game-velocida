
/**
 *
 * @author R. Springer
 */
public class TileFactory {

    /**
     * Creates a Tile object based on the mapIcon number you give
     *
     * @param mapIcon number
     * @return Tile tile object
     */
    public Tile createTile(int mapIcon) {
        Tile tile;
        switch (mapIcon) {
         case 0:
        tile = new Tile("box.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
        tile.isSolid = true;
         break;
        case 1:
            tile = new Tile("boxAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
        tile.isSolid = true;
        break;
        case 2:
        tile = new Tile("boxCoin.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid = true;
        break;
            case 4:
               tile = new Tile("boxCoinAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid = true;
                 break;
                case 5:
                tile = new Tile("boxCoinAlt_disabled.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
        break;
        case 6:
             tile = new Tile("boxEmpty.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
        break;
        case 7:
    tile = new Tile("boxExplosive.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
              break;
                case 8:
                   tile = new Tile("boxExplosive_disabled.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 9:
                   tile = new Tile("boxExplosiveAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 10:
                   tile = new Tile("boxItem.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 12:
                   tile = new Tile("boxItemAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 13:
                   tile = new Tile("boxItemAlt_disabled.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 14:
                   tile = new Tile("boxWarning.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 15:
                   tile = new Tile("brickWall.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 16:
                   tile = new Tile("bridge.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 17:
                   tile = new Tile("bridgeLogs.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 18:
                   tile = new Tile("castle.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 19:
                   tile = new Tile("castleCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 20:
                   tile = new Tile("castleCenter_rounded.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 21:
                   tile = new Tile("castleCliffLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 22:
                   tile = new Tile("castleCliffLeftAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 23:
                   tile = new Tile("castleCliffRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 24:
                   tile = new Tile("castleCliffRightAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 25:
                   tile = new Tile("castleHalf.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 26:
                   tile = new Tile("castleHalfLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 27:
                   tile = new Tile("castleHalfMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 28:
                   tile = new Tile("castleHalfRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 29:
                   tile = new Tile("castleHillLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 30:
                   tile = new Tile("castleHillLeft2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 31:
                   tile = new Tile("castleHillRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 32:
                   tile = new Tile("castleHillRight2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 33:
                  tile = new Tile("castleLedgeLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 34:
                  tile = new Tile("castleLedgeRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 35:
                   tile = new Tile("castleLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 36:
                   tile = new Tile("castleMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 37:
                   tile = new Tile("castleRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 38:
                   tile = new Tile("dirt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 39:
                   tile = new Tile("dirtCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 40:
                   tile = new Tile("dirtCenter_rounded.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 41:
                   tile = new Tile("dirtCliffLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 42:
                   tile = new Tile("dirtCliffLeftAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 43:
                   tile = new Tile("dirtCliffRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 44:
                   tile = new Tile("dirtCliffRightAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 45:
                   tile = new Tile("dirtHalf.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 46:
                   tile = new Tile("dirtHalfLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 47:
                   tile = new Tile("dirtHalfMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 48:
                   tile = new Tile("dirtHalfRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 49:
                   tile = new Tile("dirtHillLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 50:
                   tile = new Tile("dirtHillLeft2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 51:
                   tile = new Tile("dirtHillRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 52:
                   tile = new Tile("dirtHillRight2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 53:
                  tile = new Tile("dirtLedgeLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 54:
                  tile = new Tile("dirtLedgeRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 55:
                   tile = new Tile("dirtLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 56:
                   tile = new Tile("dirtMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 57:
                   tile = new Tile("dirtRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 58:
                   tile = new Tile("door_closedMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 59:
                   tile = new Tile("door_closedTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 60:
                   tile = new Tile("door_openMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 61:
                   tile = new Tile("door_openTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 62:
                   tile = new Tile("fence.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 63:
                   tile = new Tile("fenceBroken.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 64:
                 tile = new Tile("grass.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 65:
                   tile = new Tile("grassCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 66:
                   tile = new Tile("grassCenter_rounded.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 67:
                   tile = new Tile("grassCliffLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 68:
                   tile = new Tile("grassCliffLeftAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 69:
                   tile = new Tile("grassCliffRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 70:
                   tile = new Tile("grassCliffRightAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 71:
                   tile = new Tile("grassHalf.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 72:
                   tile = new Tile("grassHalfLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 73:
                   tile = new Tile("grassHalfMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 74:
                   tile = new Tile("grassHalfRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 75:
                   tile = new Tile("grassHillLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 76:
                   tile = new Tile("grassHillLeft2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 77:
                   tile = new Tile("grassHillRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 78:
                   tile = new Tile("grassHillRight2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 79:
                  tile = new Tile("grassLedgeLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 80:
                  tile = new Tile("grassLedgeRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 81:
                   tile = new Tile("grassLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 82:
                   tile = new Tile("grassMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 83:
                   tile = new Tile("grassRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 84:
                  tile = new Tile("hill_large.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 85:
                  tile = new Tile("hill_largeAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 91:
                   tile = new Tile("liquidLavaTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 92:
                   tile = new Tile("liquidLavaTop_mid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 93:
                   tile = new Tile("liquidWater.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 96:
                   tile = new Tile("lock_blue.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 97:
                   tile = new Tile("lock_green.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 98:
                   tile = new Tile("lock_red.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 99:
                   tile = new Tile("lock_yellow.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 124:
                case 151:
                   tile = new Tile("stoneCenter_rounded.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 152:
                   tile = new Tile("stoneCliffLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 153:
                   tile = new Tile("stoneCliffLeftAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 154:
                   tile = new Tile("stoneCliffRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 155:
                   tile = new Tile("stoneCliffRightAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 156:
                   tile = new Tile("stoneHalf.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 157:
                   tile = new Tile("stoneHalfLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 158:
                   tile = new Tile("stoneHalfMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 159:
                   tile = new Tile("stoneHalfRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 160:
                   tile = new Tile("stoneHillLeft2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 161:
                   tile = new Tile("stoneHillRight2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 162:
                  tile = new Tile("stoneLedgeLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 163:
                  tile = new Tile("stoneLedgeRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 164:
                   tile = new Tile("stoneLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 165:
                   tile = new Tile("stoneMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 166:
                   tile = new Tile("stoneRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 167:
                   tile = new Tile("stoneWall.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 169:
                   tile = new Tile("tochLit.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 170:
                   tile = new Tile("tochLit2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 171:
                   tile = new Tile("torch.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 172:
                   tile = new Tile("window.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 173:
                  tile = new Tile("bomb.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 174:
                  tile = new Tile("bombFlash.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 175:
                  tile = new Tile("bush.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 176:
                  tile = new Tile("buttonBlue.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 177:
                  tile = new Tile("buttonBlue_pressed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 178:
                  tile = new Tile("buttonGreen.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 179:
                  tile = new Tile("buttonGreen_pressed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                case 180:
                  tile = new Tile("snowCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                 tile.isSolid = true;
                break;
                default:
                tile = new Tile("grassMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
        }
        return tile;
    }
}

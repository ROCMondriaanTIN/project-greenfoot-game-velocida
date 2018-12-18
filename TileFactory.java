
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
                  tile = new Tile("grassMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
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
                default:
                case 93:
                tile = new Water("liquidWater.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
        }
        return tile;
    }
}

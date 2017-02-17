package com.yugiedev.ImageScape;

        import java.awt.Color;
        import java.awt.image.BufferedImage;
        import java.io.IOException;
        import java.net.MalformedURLException;
        import java.net.URL;
        import java.util.HashMap;
        import java.util.Map;
        import javax.imageio.ImageIO;
        import org.bukkit.command.Command;
        import org.bukkit.command.CommandSender;
        import org.bukkit.entity.Player;
        import org.bukkit.plugin.java.JavaPlugin;

public class ImageScape extends JavaPlugin {
    public void onDisable() {}

    public void onEnable()
    {
        this.colors[0] = new Color(127, 127, 127);  //Stone
        this.colors[1] = new Color(121, 85, 58);    //Dirt
        this.colors[2] = new Color(188, 152, 98);   //Wood Planks
        this.colors[3] = new Color(200, 200, 200);  //Double Stone Slabs
        this.colors[4] = new Color(159, 88, 69);    //Brick
        this.colors[5] = new Color(219, 68, 26);    //TNT
        this.colors[6] = new Color(169, 169, 169);    //Cobblestone
        this.colors[7] = new Color(87, 87, 87);    //BedRock
        this.colors[8] = new Color(105, 84, 51);    //All Sided Oak Log
        this.colors[9] = new Color(180, 144, 90);    //Regular Oak Log
        this.colors[10] = new Color(230, 230, 230);    //Iron Block
        this.colors[11] = new Color(255, 241, 68);    //Gold Block
        this.colors[12] = new Color(105, 223, 218);    //Diamond Block
        this.colors[13] = new Color(37, 32, 53);    //Obsidian
        this.colors[14] = new Color(220, 221, 101);    //Sponge
        this.colors[15] = new Color(97, 68, 46);    //Coarse Dirt
        this.colors[16] = new Color(164, 164, 164);    //Stone Brick
        this.colors[17] = new Color(175, 114, 70);    //Crafting Table
        this.colors[18] = new Color(146, 146, 146);    //Furnace
        this.colors[19] = new Color(209, 209, 209);    //White Wool
        this.colors[20] = new Color(251, 255, 255);    //Snow
        this.colors[21] = new Color(119, 169, 255);    //Ice
        this.colors[22] = new Color(170, 174, 190);    //Clay
        this.colors[23] = new Color(155, 102, 75);    //Jukebox
        this.colors[24] = new Color(128, 107, 111);    //Mycelium
        this.colors[25] = new Color(227, 170, 0);    //Pumpkin
        this.colors[26] = new Color(181, 29, 27);    //Red Mushroom
        this.colors[27] = new Color(149, 113, 89);    //Brown Mushroom
        this.colors[28] = new Color(142, 48, 46);    //Red Wool
        this.colors[29] = new Color(204, 120, 144);    //Pink Wool
        this.colors[30] = new Color(167, 84, 30);    //Red Sandstone
        this.colors[31] = new Color(124, 134, 33);    //Melon
        this.colors[32] = new Color(214, 211, 200);    //White Mushroom Side
        this.colors[33] = new Color(171, 144, 102);    //White Mushroom Inside
        this.colors[34] = new Color(40, 68, 138);    //Lapis Lazuli
        this.colors[35] = new Color(50, 66, 26);    //Green Wool
        this.colors[36] = new Color(61, 165, 53);    //Lime Wool
        this.colors[37] = new Color(124, 94, 39);    //Jungle Log Side
        this.colors[38] = new Color(75, 47, 29);    //Brown Wool
        this.colors[39] = new Color(198, 183, 19);    //Yellow Wool
        this.colors[40] = new Color(195, 189, 137);    //Endstone
        this.colors[41] = new Color(220, 211, 162);    //SandStone
        this.colors[42] = new Color(43, 53, 133);    //Blue Wool
        this.colors[43] = new Color(93, 127, 197);    //Light Blue Wool
        this.colors[44] = new Color(108, 101, 90);    //Acacia Log Side
        this.colors[45] = new Color(168, 88, 51);    //Acacia Log Top
        this.colors[46] = new Color(196, 172, 114);    //Birch Log Top
        this.colors[47] = new Color(121, 91, 55);    //Spruce log top
        this.colors[48] = new Color(120, 56, 174);    //Purple Wool
        this.colors[49] = new Color(177, 68, 186);    //Wool Magenta
        this.colors[50] = new Color(128, 94, 54);    //Spruce Planks
        this.colors[51] = new Color(184, 135, 100);    //Acacia Planks
        this.colors[52] = new Color(44, 103, 128);    //Cyan Wool
        this.colors[53] = new Color(218, 120, 54);    //Orange Wool
        this.colors[54] = new Color(176, 116, 80);    //Redstone Lamp
        this.colors[55] = new Color(215, 203, 141);    //Birch Planks
        this.colors[56] = new Color(55, 27, 33);    //Netherbrick
        this.colors[57] = new Color(55, 27, 33);    //Wool Lightgrey
        this.colors[58] = new Color(22, 18, 18);    //Wool Black
        this.colors[59] = new Color(61, 61, 61);    //Wool Grey
        this.colors[60] = new Color(47, 30, 11);    //Spruce Side
        this.colors[61] = new Color(231, 231, 231);    //Birch Side
        this.colors[62] = new Color(95, 233, 134);    //Emerald Block
        this.colors[63] = new Color(21, 21, 21);    //Coal Block
        this.colors[64] = new Color(207, 179, 28);    //Hay Top
        this.colors[65] = new Color(210, 28, 12);    //RedStone Block
        this.colors[66] = new Color(209, 177, 161);    //Clay White
        this.colors[67] = new Color(179, 91, 41);    //Clay Orange
        this.colors[68] = new Color(149, 87, 108);    //Clay Magenta
        this.colors[69] = new Color(112, 108, 138);    //Clay Light Blue
        this.colors[70] = new Color(205, 147, 40);    //Clay Yellow
        this.colors[71] = new Color(103, 117, 52);    //Clay Lime
        this.colors[72] = new Color(160, 77, 78);    //Clay Pink
        this.colors[73] = new Color(57, 42, 36);    //Clay Gray
        this.colors[74] = new Color(135, 106, 97);    //Clay Light Gray
        this.colors[75] = new Color(86, 90, 91);    //Clay Cyan
        this.colors[76] = new Color(118, 69, 86);    //Clay Purple
        this.colors[77] = new Color(74, 59, 91);    //Clay Blue
        this.colors[78] = new Color(77, 50, 36);    //Clay Brown
        this.colors[79] = new Color(75, 82, 42);    //Clay Green
        this.colors[80] = new Color(142, 60, 46);    //Clay Red
        this.colors[81] = new Color(37, 22, 16);    //Clay Black
        this.colors[82] = new Color(149, 91, 66);    //Clay Hardened Clay
        this.colors[83] = new Color(236, 232, 226);    //Quartz
        this.colors[84] = new Color(151, 180, 232);    //Packed Ice
        this.colors[85] = new Color(173, 174, 165);    //Andesite
        this.colors[86] = new Color(208, 208, 211);    //Diorite
        this.colors[87] = new Color(165, 115, 96);    //Granite
        this.colors[88] = new Color(121, 183, 171);    //Prismarine
        this.colors[89] = new Color(87, 124, 112);    //Dark Prismarine
        this.colors[90] = new Color(173, 169, 53);    //Wet Spone
        this.colors[91] = new Color(194, 160, 194);    //Purpur Block
        this.colors[92] = new Color(205, 90, 15);    //Magma Block
        this.colors[93] = new Color(146, 26, 29);    //Netherwart Block
        this.colors[94] = new Color(66, 1, 2);    //Red Netherbrick
        String[] colorIDs = new String[95];
        colorIDs[0] = "1";
        colorIDs[1] = "3";
        colorIDs[2] = "5";
        colorIDs[3] = "44:8";
        colorIDs[4] = "45";
        colorIDs[5] = "46";
        colorIDs[6] = "4";
        colorIDs[7] = "7";
        colorIDs[8] = "17:12";
        colorIDs[9] = "17:12";
        colorIDs[10] = "42";
        colorIDs[11] = "41";
        colorIDs[12] = "57";
        colorIDs[13] = "49";
        colorIDs[14] = "19";
        colorIDs[15] = "3:1";
        colorIDs[16] = "98";
        colorIDs[17] = "58";
        colorIDs[18] = "61";
        colorIDs[19] = "35";
        colorIDs[20] = "80";
        colorIDs[21] = "79";
        colorIDs[22] = "82";
        colorIDs[23] = "84";
        colorIDs[24] = "110";
        colorIDs[25] = "86";
        colorIDs[26] = "100";
        colorIDs[27] = "99";
        colorIDs[28] = "35:14";
        colorIDs[29] = "35:6";
        colorIDs[30] = "179";
        colorIDs[31] = "103";
        colorIDs[32] = "99:15";
        colorIDs[33] = "99:10";
        colorIDs[34] = "22";
        colorIDs[35] = "35:13";
        colorIDs[36] = "35:5";
        colorIDs[37] = "17:15";
        colorIDs[38] = "35:12";
        colorIDs[39] = "35:4";
        colorIDs[40] = "121";
        colorIDs[41] = "24";
        colorIDs[42] = "35:11";
        colorIDs[43] = "35:3";
        colorIDs[44] = "162:12";
        colorIDs[45] = "162";
        colorIDs[46] = "17:2";
        colorIDs[47] = "17:1";
        colorIDs[48] = "35:10";
        colorIDs[49] = "35:2";
        colorIDs[50] = "5:1";
        colorIDs[51] = "5:4";
        colorIDs[52] = "35:9";
        colorIDs[53] = "35:1";
        colorIDs[54] = "123";
        colorIDs[55] = "5:2";
        colorIDs[56] = "112";
        colorIDs[57] = "35:8";
        colorIDs[58] = "35:15";
        colorIDs[59] = "35:7";
        colorIDs[60] = "17:13";
        colorIDs[61] = "17:14";
        colorIDs[62] = "133";
        colorIDs[63] = "173";
        colorIDs[64] = "170";
        colorIDs[65] = "152";
        colorIDs[66] = "159";
        colorIDs[67] = "159:1";
        colorIDs[68] = "159:2";
        colorIDs[69] = "159:3";
        colorIDs[70] = "159:4";
        colorIDs[71] = "159:5";
        colorIDs[72] = "159:6";
        colorIDs[73] = "159:7";
        colorIDs[74] = "159:8";
        colorIDs[75] = "159:9";
        colorIDs[76] = "159:10";
        colorIDs[77] = "159:11";
        colorIDs[78] = "159:12";
        colorIDs[79] = "159:13";
        colorIDs[80] = "159:14";
        colorIDs[81] = "159:15";
        colorIDs[82] = "172";
        colorIDs[83] = "155";
        colorIDs[84] = "174";
        colorIDs[85] = "1:5";
        colorIDs[86] = "1:3";
        colorIDs[87] = "1:1";
        colorIDs[88] = "168";
        colorIDs[89] = "168:2";
        colorIDs[90] = "19:1";
        colorIDs[91] = "201";
        colorIDs[92] = "213";
        colorIDs[93] = "214";
        colorIDs[94] = "215";
        for (int i = 0; i <= 94; i++) {
            this.cMap.put(Integer.valueOf(this.colors[i].getRGB()), colorIDs[i]);
        }
        this.cMap.put(Integer.valueOf(-1), "0");
    }

    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
    {
        URL u;
        if (args.length < 1)
        {
            sender.sendMessage("§aImage§2Scape §7┃ §cYou need to specify an image!");
            return true;
        }
        try
        {
            u = new URL(args[0]);
        }
        catch (MalformedURLException e)
        {
            sender.sendMessage("§aImage§2Scape §7┃ §cYour parameter is malformed!");
            return true;
        }
        try
        {
            BufferedImage img = ImageIO.read(u);
            int p1 = 0;
            int p2 = 0;
            int p3 = 0;
            for (int x = 0; x <= img.getWidth() - 1; x++) {
                for (int y = 0; y <= img.getHeight() - 1; y++)
                {
                    int closestMatch = getClosestMatch(img, x, y);
                    int blockID = Integer.parseInt(((String)this.cMap.get(Integer.valueOf(closestMatch))).split(":")[0]);
                    int blockData;
                    if (((String)this.cMap.get(Integer.valueOf(closestMatch))).split(":").length > 1) {
                        blockData = Integer.parseInt(((String)this.cMap.get(Integer.valueOf(closestMatch))).split(":")[1]);
                    } else {
                        blockData = 0;
                    }
                    if (commandLabel.equalsIgnoreCase("isc"))
                    {
                        p1 = x;
                        p2 = 0;
                        p3 = y + img.getHeight() - 1;
                    }
                    ((Player)sender).getLocation().add(p1, p2, p3).getBlock().setTypeId(blockID);
                    ((Player)sender).getLocation().add(p1, p2, p3).getBlock().setData((byte)blockData);
                }
            }
        }
        catch (IOException e)
        {
            sender.sendMessage("§aImage§2Scape §7┃ §cCouldn't locate the image!");
            return true;
        }
        return true;
    }

    int getClosestMatch(BufferedImage img, int x, int y)
    {
        if ((img.getRGB(x, y) >> 24 & 0xFF) < 10) {
            return -1;
        }
        int prevMin = 765;
        int closestMatch = 15727611;
        for (int i = 0; i <= 94; i++) {
            if (i != 0) {
                if (getColorDifference(img.getRGB(x, y), this.colors[i]) < prevMin)
                {
                    prevMin = getColorDifference(img.getRGB(x, y), this.colors[i]);
                    closestMatch = this.colors[i].getRGB();
                }
            }
        }
        return closestMatch;
    }

    int getColorDifference(int c1, Color c2)
    {
        int diff = 0;
        this.c = new Color(c1);
        diff += Math.abs(this.c.getRed() - c2.getRed());
        diff += Math.abs(this.c.getGreen() - c2.getGreen());
        diff += Math.abs(this.c.getBlue() - c2.getBlue());
        return diff;
    }

    Color[] colors = new Color[95];
    Color c;
    Map<Integer, String> cMap = new HashMap();
}
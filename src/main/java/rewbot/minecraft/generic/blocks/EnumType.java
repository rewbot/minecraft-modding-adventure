package rewbot.minecraft.generic.blocks;

import net.minecraft.util.IStringSerializable;

public enum EnumType implements IStringSerializable {
    WHITE(0, "white"),
    BLACK(1, "black");

    private int id;
    private String name;

    private EnumType(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getName();
    }

    public int getId() {
        return id;
    }
}

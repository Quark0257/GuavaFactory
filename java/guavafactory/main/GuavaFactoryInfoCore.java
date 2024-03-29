package guavafactory.main;

import net.minecraftforge.fml.common.ModMetadata;

public class GuavaFactoryInfoCore 
{
	public static void registerInfo(ModMetadata meta) 
	{
		meta.modId = Reference.MOD_ID;
		meta.name = Reference.MOD_NAME;
		meta.description = "Add special items, blocks, mobs and dimension.";
		meta.version = Reference.MOD_VERSION;
		meta.url = "";
		meta.authorList.add("Quark");
		meta.authorList.add("Matyou");
		meta.authorList.add("Core");
		meta.credits = "Enjoy playing this mod.";
		meta.logoFile = "logo.png";
		meta.autogenerated = false;
	}
}

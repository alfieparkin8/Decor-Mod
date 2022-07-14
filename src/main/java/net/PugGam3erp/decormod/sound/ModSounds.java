package net.PugGam3erp.decormod.sound;

import net.PugGam3erp.decormod.DecorMod;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModSounds {

    public static SoundEvent ALFIE = registerSoundEvent("alfie");
    public static SoundEvent LUCA = registerSoundEvent("luca");
    public static SoundEvent ELLIE = registerSoundEvent("ellie");
    public static SoundEvent SHANN = registerSoundEvent("shann");


    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(DecorMod.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }
}
package net.ronondex2009.essence_of_harmony.spell.custom;

import java.util.List;

import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.ronondex2009.essence_of_harmony.sound.ModSounds;
import net.ronondex2009.essence_of_harmony.util.AbstractSymbol;
import net.ronondex2009.essence_of_harmony.util.Spell;
import net.ronondex2009.essence_of_harmony.util.notes;

public class RevealStackSpell extends Spell 
{
        @Override
    public boolean runSpell(List<AbstractSymbol> stack, Player player, Level level) {
        if(!level.isClientSide) player.sendSystemMessage(Component.literal("" + stack.toString()));
        player.playSound(ModSounds.CAST_SPELL.get());
        return true;
    }

    public RevealStackSpell()
    {
        spellNotes.add(notes.G);
        spellNotes.add(notes.F);
        spellNotes.add(notes.G);
        spellNotes.add(notes.E);
        spellNotes.add(notes.C);
    }
}

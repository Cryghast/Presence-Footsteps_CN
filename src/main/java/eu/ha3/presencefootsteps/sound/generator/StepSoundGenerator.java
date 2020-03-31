package eu.ha3.presencefootsteps.sound.generator;

import eu.ha3.presencefootsteps.sound.Isolator;
import net.minecraft.entity.LivingEntity;

/**
 * Has the ability to generate footsteps based on a Player.
 *
 * @author Hurry
 *
 */
public interface StepSoundGenerator {
    /**
     * Generate footsteps sounds of the Entity.
     */
    void generateFootsteps(LivingEntity ply);

    /**
     * Sets this engine to use the parameters from a new isolator.
     */
    void setIsolator(Isolator isolator);
}

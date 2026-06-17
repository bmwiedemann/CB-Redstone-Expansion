package Comet_Blaze.neo.cbadd.client;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;

public class ClientOnlyHandler {

    @OnlyIn(Dist.CLIENT)
    public static void openBindKeyScreen(InteractionHand hand, BlockPos pos) {
        ClientScreenOpener.open(hand, pos);
    }

    @OnlyIn(Dist.CLIENT)
    private static class ClientScreenOpener {
        private static void open(InteractionHand hand, BlockPos pos) {
            net.minecraft.client.Minecraft.getInstance().setScreen(new Comet_Blaze.neo.cbadd.client.screen.BindKeyScreen(hand, pos));
        }
    }
}
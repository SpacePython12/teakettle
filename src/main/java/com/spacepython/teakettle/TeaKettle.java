package com.spacepython.teakettle;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.stream.Collectors;
import java.io.File;
import java.io.FilenameFilter;
import py4j.GatewayServer;

@Mod(name="TeaKettle", modid="teakettle", version="1.17.1-R1")
public class TeaKettle
{
    private static final Logger LOGGER = LogManager.getLogger();

    public TeaKettle() {
        MinecraftForge.EVENT_BUS.register(this);
        server = new GatewayServer(this);
        server.start();
        Minecraft this.minecraft = Minecraft.getMinecraft();
    }
}
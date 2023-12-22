package net.md_5.bungee;

import net.md_5.bungee.protocol.packet.Respawn;
import net.md_5.bungee.protocol.packet.ClientStatus;
import net.md_5.bungee.protocol.packet.PluginMessage;

public class PacketConstants
{

    public static final Respawn DIM1_SWITCH = new Respawn( (byte) 1, (byte) 0, (byte) 0, (short) 256, "DEFAULT" );
    public static final Respawn DIM2_SWITCH = new Respawn( (byte) -1, (byte) 0, (byte) 0, (short) 256, "DEFAULT" );
    public static final ClientStatus CLIENT_LOGIN = new ClientStatus( (byte) 0 );
    public static final PluginMessage FORGE_MOD_REQUEST = new PluginMessage( "FML", new byte[]
    {
        0, 0, 0, 0, 0, 2
    } );
    public static final PluginMessage I_AM_BUNGEE = new PluginMessage( "BungeeCord", new byte[ 0 ] );
}

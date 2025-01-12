# TaterComms

[![License](https://img.shields.io/github/license/p0t4t0sandwich/TaterComms?color=blue)](https://img.shields.io/github/downloads/p0t4t0sandwich/TaterComms/LICENSE)
[![Github](https://img.shields.io/github/stars/p0t4t0sandwich/TaterComms)](https://github.com/p0t4t0sandwich/TaterComms)
[![Github Issues](https://img.shields.io/github/issues/p0t4t0sandwich/TaterComms?label=Issues)](https://github.com/p0t4t0sandwich/TaterComms/issues)
[![Discord](https://img.shields.io/discord/1067482396246683708?color=7289da&logo=discord&logoColor=white)](https://discord.neuralnexus.dev)
[![wakatime](https://wakatime.com/badge/user/fc67ce74-ca69-40a4-912f-61b26dbe3068/project/c722f2dd-f37e-4e20-9b32-e00d4d8ec34b.svg)](https://wakatime.com/badge/user/fc67ce74-ca69-40a4-912f-61b26dbe3068/project/c722f2dd-f37e-4e20-9b32-e00d4d8ec34b)

A simple, cross API plugin that bridges communication between servers, using built-in Proxy methods, Discord channels and TCP sockets.

Link to our support: [Discord](https://discord.neuralnexus.dev)

## Download

[![Github Releases](https://img.shields.io/github/downloads/p0t4t0sandwich/TaterComms/total?label=Github&logo=github&color=181717)](https://github.com/p0t4t0sandwich/TaterComms/releases)
[![Maven Repo](https://img.shields.io/maven-metadata/v?label=Release&metadataUrl=https%3A%2F%2Fmaven.neuralnexus.dev%2Freleases%2Fdev%2Fneuralnexus%2FTaterComms%2Fmaven-metadata.xml)](https://maven.neuralnexus.dev/#/releases/dev/neuralnexus/TaterComms)
[![Maven Repo](https://img.shields.io/maven-metadata/v?label=Snapshot&metadataUrl=https%3A%2F%2Fmaven.neuralnexus.dev%2Fsnapshots%2Fdev%2Fneuralnexus%2FTaterComms%2Fmaven-metadata.xml)](https://maven.neuralnexus.dev/#/snapshots/dev/neuralnexus/TaterComms)

[![Spigot](https://img.shields.io/spiget/downloads/110592?label=Spigot&logo=spigotmc&color=ED8106)](https://www.spigotmc.org/resources/tatercomms.110592/)
[![Hangar](https://img.shields.io/badge/Hangar-download-blue)](https://hangar.papermc.io/p0t4t0sandwich/TaterComms)
[![Modrinth](https://img.shields.io/modrinth/dt/tatercomms?label=Modrinth&logo=modrinth&color=00AF5C)](https://modrinth.com/mod/tatercomms)
[![CurseForge](https://img.shields.io/curseforge/dt/877133?label=CurseForge&logo=curseforge&color=F16436)](https://www.curseforge.com/minecraft/mc-mods/tatercomms)
[![Sponge](https://img.shields.io/ore/dt/tatercomms?label=Sponge&logo=https%3A%2F%2Fspongepowered.org%2Ffavicon.ico&color=F7CF0D)](https://ore.spongepowered.org/p0t4t0sandwich/TaterComms)

## Usage

- [Configuration guide wiki entry](https://github.com/p0t4t0sandwich/TaterComms/wiki/Configuration-Guide)
- [Create and add a Discord bot to your server](https://discordpy.readthedocs.io/en/stable/discord.html)
- The bot will need permissions to read and send messages with whatever permission scopes you set up, and in the channels you want to use

## Known Issues

- Under certain circumstances with a proxy, prefix/suffix information is not read correctly, still narrowing down the cause 
- Global chat still needs some tweaking and a proper, per-user toggle
- Sponge death messages are a tad off with how the component serializes (eg: `playerName Skeleton was shot by` instead of `playerName was shot by Skeleton`)
- Still need to tweak the pass-through system and get that working properly
- Some implementations fire the shutdown event after the plugin unloads, so the shutdown message doesn't get sent
- Bukkit 1.6.4 doesn't have an advancement event
- Bukkit b1.7.3 doesn't support the following
  - proper death/advancement events
  - plugin messaging

## Dependencies

- [TaterLib](https://github.com/p0t4t0sandwich/TaterLib) - Required on all platforms
- [FabricAPI](https://modrinth.com/mod/fabric-api) - Required on Fabric

### Optional Dependencies

- [LuckPerms](https://luckperms.net/) - For permissions/prefix/suffix support

## Compatibility Cheatsheet

TaterComms supports: Bukkit, Bungee, Fabric, Forge, Sponge, and Velocity

| Server type         | Versions    | Jar Name                        |
|---------------------|-------------|---------------------------------|
| All 1.20 (Sponge11) | 1.20-1.20.2 | `TaterComms-1.20-<version>.jar` |
| All 1.19 (Sponge10) | 1.19-1.19.4 | `TaterComms-1.19-<version>.jar` |
| All 1.18 (Sponge9)  | 1.18-1.18.2 | `TaterComms-1.18-<version>.jar` |
| All 1.17 (Sponge9)  | 1.17-1.17.1 | `TaterComms-1.17-<version>.jar` |
| All 1.16 (Sponge8)  | 1.16-1.16.5 | `TaterComms-1.16-<version>.jar` |
| All 1.15 (Sponge8)  | 1.15-1.15.2 | `TaterComms-1.15-<version>.jar` |
| All 1.14            | 1.14-1.14.3 | `TaterComms-1.14-<version>.jar` |

## Commands and Permissions

| Command              | Permission                   | Description                 |
|----------------------|------------------------------|-----------------------------|
| `/tatercomms reload` | `tatercomms.admin.reload`    | Reload the plugin           |
| `/discord`           | `tatercomms.command.discord` | Get the Discord invite link |

## Release Notes

### v1.0.3

- Recoded to use TaterLib for easier cross-API support
- Once again depends on the fabric API
- Back ported to 1.14 and added support for Sponge 8-11
- Added plugin message support for server-side only events
- Implemented plugin channel support for all platforms
- Overhauled the message relay system
  - Added Remote TCP socket support

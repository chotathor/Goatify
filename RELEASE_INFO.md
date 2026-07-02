Echo Music v5.2.4

Performance
Faster playback startup by pre-warming the JavaScript engine on app launch and reducing ExoPlayer's initial buffer threshold to 750ms.
Faster app startup by moving image cache size calculation to a background thread.

Playback Engine
Added a self-healing remote configuration system for YouTube player signature updates, so fixes no longer require a new app version.
Added SponsorBlock support to automatically skip sponsorships, intros, outros, and other non-music segments (toggle in Content Settings).
Disabled "320 kbps" (Saavn) and "Lossless" (Qobuz) quality options due to server maintenance; affected users will be migrated automatically to Opus or YouTube Music.

ListenBrainz
Moved ListenBrainz settings to the Account page and made the integration fully functional.
Fixed scrobbling reliability by tracking playback state directly instead of relying on transition triggers, pulling metadata from the active stream, and including app version headers in submissions.

Discord
Added Discord integration, with Rich Presence that updates automatically on song change, playback state, and setting changes.
Fixed Rich Presence not syncing by automating token extraction.

Last.fm
Added Last.fm integration, including scrobbling and optional likes sync.

Spotify Import
Added support for importing any Spotify playlist via share link, URI, or ID, including playlists you don't own. (#645)

Bug Fixes
Fixed sharing YouTube Music links to Echo Music not opening or playing the song/playlist.
Fixed share.echomusic.fun links not routing to the correct song.
Fixed local song thumbnails not displaying correctly in the player and song lists. (#658)
Fixed a crash opening the export directory picker on devices without a compatible picker; the app now falls back to its default export folder. (#663)
Fixed a crash during database migration caused by a duplicate provider column. (#664)

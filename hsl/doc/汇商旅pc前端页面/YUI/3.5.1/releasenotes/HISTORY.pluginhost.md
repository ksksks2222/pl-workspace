Plugin Host Change History
==========================

3.5.1
-----

  * No changes.

3.5.0
-----

  * API corrected for hasPlugin. It returns the plugin if available, otherwise undefined.
    It has always done this, and since they're truthy/falsey, figured it was better than
    changing the behavior, in case folks are using the plugin instance returned by hasPlugin.

3.4.1
-----

  * No changes.

3.4.0
-----

  * No changes.

3.3.0
-----

  * Broke pluginhost into pluginhost-base, pluginhost-config

    pluginhost-base provides the core plug/unplug methods.

    pluginhost-config provides support for constructor configuration
    and static configuration of plugins.

  * Added log statement if an invalid plugin is provided

3.2.0
-----

  * No changes

3.1.1
-----

  * No changes

3.1.0
-----

  * Plugins now destroyed correctly, when host is destroyed.

3.0.0
-----

  * Split out of "base" as a standalone module, for use by Node.

DSM viewer
==========

This tool allows Design Structure Matrixes produced by Depends (https://github.com/multilang-depends/depends) to be visualized. You must download depends and then use the following command:

java -jar depends.jar -s -p dot -d . java originalData/myproject/src dependency

This will produce a file called dependency.json which you can then load directly.

You can start by visualizing the architecture of the dsmviewer itself!

from LilypondDataclasses import *
from MxmlDataclasses import *

def writemxml(node):
    outStr = node.enter()

    if len(node.children > 0):
        for child in node.children:
            writemxml(child)

    outStr += node.leave()

    return outStr


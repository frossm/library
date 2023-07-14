# Fross Common Library Classes

These classes contain common object/methods I use across all of my applications. This library, which will be saved as a GitHub package, can be setup as a dependency and changes can be automatically leveraged.

I don't expect anyone else to use this library, but I made it public so my other public software can be usable as this is a requirement for many of them.

## Install into Maven .M2 Cache
I used to simply run `mvn install` in the main library directory (the one containing the pom.xml file) to install it into the local maven cache.  That works fine.  However, I've recently created a Github package of library and can not call it directly like any other dependency.  You simply have to define the repository in your pom.xml file.
``

## Setting Up a Project to Depend on Library
Ok, now that we have **library** built and installed, we need to set it up as an Eclipse maven dependency.

 1. In Eclipse, select the main project, right click and choose Maven|Add Dependency
 2. Add the GroupID as: **org.fross**
 3. Add the ArtifactID as: **library**
 4. Add the current version
 5. In the search field, enter: **fross** and you should see your open projects.  **Select org.fross library**
 6. This will add a dependency line in your pom.xml file as well as setting up Eclipse to use it.  You should now see library in your Maven Dependencies within Eclipse.

## Using the library classes
This is fairly simple.  Just import the class into your files as in:

    import org.fross.library.Output;

After this everything should compile fine and you'll be good to go.  Just  remember to update the Maven cache when library is changed or if you delete the cache for some reason.
	
## License
[The MIT License](https://opensource.org/licenses/MIT)  [https://opensource.org/licenses/MIT](https://opensource.org/licenses/MIT)

Copyright 2019-2020 by Michael Fross

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

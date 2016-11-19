[![Build Status](https://travis-ci.org/MakerDB/MakerDB.svg?branch=master)](https://travis-ci.org/MakerDB/MakerDB)

# Maker DB

MakerDB is **THE** inventory management software for electronic parts.

The objective of this project is to build a solution which caters to hobbyists, small and medium businesses as well as large corporations.

## Architecture

### Philosophy 

MakerDB is an inventory management software which should ideally be for electronic parts only.

However eventually, common patterns will emerge with any inventory management software.

At such a point we will separate those common components into another repository with the aim to re-use them in other inventory management software that we or others might build.

Also, for the beginning phase of the project (Lets call this the Alpha phase), the project would be in a constant state of flux from a development and architecture prospective.

### Key Concepts

There are two key concepts on which the architecture is based.

1) Object - Something which is kept in the inventory.
2) Location - Where an object is kept.

Everything in the system will and should revolve around these two essential concepts.

## Development Process

### Issues, Features and Enhancements

GitHub issue tracker will be used for tracking issues, features and enhancements.

### CI

Travis will be used for CI. All check in must pass CI unless agreed upon from before.

### Branches

Master is sacrosanct and will be used for all public releases.
Development will be for bleeding edge releases.

All contribution must be made by a pull request, reviewed and then merged.

### Versioning

This is kind of important.

For the initial phases we will follow a modified version of semantic versioning.

0.Major.Minor

Major and Minor mean the same thing as they mean in case of semantic versioning. Patch is irrelevant in this phase.

## License
    Copyright 2016 Sushant Khanna
        
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
        
    http://www.apache.org/licenses/LICENSE-2.0
        
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
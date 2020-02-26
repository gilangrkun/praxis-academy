### Mempraktikan *Collaborative Development with Git*

#### Examples Scenario

Here's our scenario: Alice starts a project called "rhymes", it's a simple Git repo with a bunch of Alice's favorite nursery rhymes stored in it. Bob uses the project and wants to contribute to it. Specifically, he wants to contribute a few new rhymes, and help improve formatting to make the documents easier to read. Alice will review Bob's changes, accept some of them, then make her own changes to the project. Then Bob needs to sync up his copy of the project with Alice's.

Alice's rhymes project is hosted on GitHub, which conveniently provides beautiful graphical interfaces for exploring and interacting with Git repositories. This makes it easy for Bob and other people to use and contribute to.

The steps below walk through both Alice's and Bob's workflows step-by-step. Follow along on your own computer as Alice or Bob. If you have a partner to do this with, one of you can be Alice and one of you can be Bob, or if you have two GitHub accounts, you can play both roles.

#### Step 1: Alice creates a new project and hosts it on GitHub
(Alice is done. I following as Bob, so I must "fork" her repo here: [https://github.com/bryanhirsch/rhymes](https://github.com/bryanhirsch/rhymes).

After click the link above, I get into her Git repo and then just click the "fork" button on the right top of repo.
![Fork](https://github.com/gilangrkun/rhymes/blob/master/img/sc_copy1.jpg)

#### Step 2: Bob copies Alice's project, then submits some simple changes
Bob adds Hickory Dickory Dock to his copy of rhymes. So, I following bob and write this on my terminal:

    # First Bob clones his fork of Alice's rhymes project.
    # (If you're following along, replace bryanhirsch below with your own GitHub username.)
    git clone https://github.com/bryanhirsch/rhymes.git
    cd rhymes

    # To keep things simple and tidy, Bob will keep the master branch in sync with Alice's version of the master branch.
    # Bob creates a new branch, where he will store his changes.
    git checkout -b hickory-dickory

    # Add Hickory Dickory Dock to the repo.
    wget https://www.acquia.com/sites/default/files/blog/hickory-dickory-dock.txt...
    add hickory-dickory-dock.txt
    git commit -m 'Added hickory-dickory-dock.txt.'

    # Bob pushes the changes from his local copy of rhymes up to GitHub.
    git push origin hickory-dickory





def gitDownload(repo)
{
	git "https://github.com/SrihariGitHub99/${repo}.git"
}
def newBuild()
{
	sh 'mvn package'
}

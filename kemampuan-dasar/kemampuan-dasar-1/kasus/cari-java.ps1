""
Write-Host "Ada file Java pada direktori: "

$Dir = Get-ChildItem 'C:\Users' -Recurse | where {$_.Extension -eq ".java"} | % {
     Write-Host $_.FullName
}
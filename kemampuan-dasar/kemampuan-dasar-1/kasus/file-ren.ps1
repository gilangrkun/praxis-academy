""
Write-Host "Ada file Java pada direktori: "

$Dir = Get-ChildItem 'C:\Users' -Recurse | where {$_.Extension -eq ".java"} | % {
     Write-Host $_.FullName
}

$Name = Get-ChildItem 'C:\Users' -Recurse | where {$_.extension -eq ".java"}

""

$confirmation = Read-Host "$Name ada, ingin diganti namanya? [y/n]"
if ($confirmation -eq 'y') {
    $Input = Read-Host -Prompt 'Masukkan nama baru'
    $Name | Rename-Item -NewName $Input
    

    $NewName = Get-ChildItem 'C:\Users' -Recurse | where {$_.extension -eq ".java"}
    ""
    Write-Host "Nama file Java berubah menjadi: $NewName"

}
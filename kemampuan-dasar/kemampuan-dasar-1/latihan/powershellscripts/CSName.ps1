Get-wmiobject -Class win32_operatingSystem -ComputerName localhost |
Select-Object -Property CSName,LastBootUpTime
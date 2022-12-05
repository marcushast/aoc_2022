object Day03 {
    val data1 = """
        vJrwpWtwJgWrhcsFMMfFFhFp
        jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL
        PmmdzqPrVvPwwTWBwg
        wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn
        ttgJtRGJQctTZtZT
        CrZsJsPPZsGzwwsLwLmpwMDw
    """.trimIndent()

    val data2 = """
        lDDWVvlVVQfDMlWjGJTRjQCgTGLCLj
        ZLZpwzLBhwZhSLBsjntGCtgJRjbnJgSG
        qppdZzzsdsmZphrNsNwZhllDHLcVVDWFPvFWcWdFlv
        ztdhgJDBJghmQtPFQPpmbw
        lVlLRcnfllcfVcccGnSQVLcsTPFbpwsPFspTSqmbpswpbF
        cCHRGcGcCRGlGrGcVGnrdWHWBDzBNhhQZWWNBhJz
        NfnSSQpdnRSSpvWdSsjZDGNDjGDwTGTjHG
        wlPzPqzPFbMmqPCFCJmbsjbHLDDHDZjDjbGHsT
        gwMlgmtmPcqVVvhVnvcRnn
        cBNBBCHhbhNhblBcCCvcBHSwTwDQSqRwDQpDRsjHST
        dPmzMVWdmmMnnZJtZVdqjTSrjTjrpQrsTTVwQRSj
        qzmZMmdZPtnGqclblGlbGvgBFc
        ZfpmNDfRhzbbqDnD
        SFtFjTTZVTFvVTjHrsVvqGBJqhnSSnbJznLGJwJq
        TjdPPtdMPPWCcZgW
        qsbmGCsjHNhmhmhzTDznpnlQZlbWlZ
        LTSSfSvggVVgBgfLtvvtTSczzpWnZQZnlnzpBcnWpQWc
        FrLvrrrVPgdPftSHHdNsjTHjmGThhm
        wGQlMjvMwpvjvZjZTZlWjplWJJTggDTgfCnntPgTJPbtPgSP
        qNhJmcVmdJqhHnPnDNtnPDCg
        LrrchqhRdLVzRdmhJcFFQWGGMjpGlvZzlQQv
        ZqZMbZMfQZptpjlF
        PJCggvHlwWHvSSvCJNvSPvDBtFDQThFQjtRQhhFTsVThQtsF
        PwWCnBBCClcMMznMdG
        rNwwQJrJrnQswrQrRRwCShBSLndZpdnhpGFSdhBp
        PvzzWVzbclGFhLFGdZll
        VWjPWvbjcVbVcGVzjcgzgwQQRRRrqwRJQwwstCRR
        zjBMMzznjbssrBrMBbvHDmrlprlrpwGpwQDV
        LhRwPPTLLNRZqScPWPWPTSmQvQQDGGdQHVDlmVpQGD
        NtfhNwhLLNwRwRNcTBgnJMCBzsBFjsJfCz
        jZjsWNDlPfClfMlM
        GjqbVSqjhgvgSVSBCPmMmCmfpwTBfh
        nGbjqtqcGzsLDFcJLs
        ZQtmZdtdQcLndRncdQQLFjWWDHNPfhpnqhqsHNNDnpHs
        TrMBGbJTwwlmDPPPWshWHfJq
        wmVzbrwbwvBlBlVGtSVLSdFjdFtdjLVR
        LBhZFhRPbbnPddMdPPlD
        NQszQNczlCSlJSsg
        mwmrVQwpQVWwTlvBpHHHFhZj
        pzzDffWpQBzMpHvzMfRnTNhZdrdBcnLrcdrTLZ
        msgJgtmbgmqJJcdrGcJjGn
        bSVPgwntmVnngQWvWSSMpMMHWH
        gmGMDHHdpngdrGmGcwbNCCnNcbbCSLwL
        zQPPPffQQlVlsPFQFzQchZZbLZNVcbqbNqbZgq
        PRjQzfRgRfjQBTfJQTlPFRHWmmvmWHGWrWvWWtjrdHpD
        vfrHfqrLfLwwNHdvnthpnnFFpstn
        gWcMclgmcRcWgDMWgBgGGFnntqQnGphdQhtbdFnh
        qRWmRDlcDqWBBPwPNrZHrwSHjTfr
        HVVbhdCdndhZSShMzRrzSM
        qBjWqvtWvDJjTjjGJtJtnqBvZMrgSGZlgfSgSRrMQGQRMgMR
        wmwtJsvjtTJwsNnVsHpdnsHdds
        FCJNZDMPNCNvzqQJHqzGqv
        hwjWcSTHwRpSWnQtGgQgGStgQQ
        WpwhRHTRpcLRjwlwwTWBcWdlFbCrsPrrLCMDrZCFsCDPrZPM
        DJjjShSGhGDSNdpfrWWcLFzrDWrDlF
        wtqZgwMBBPVMCBPQggMwqMMzfLlWrWLLzsWcFzTzVTzLss
        tgtwQqZBQQZbBZtPgbHpNJnJShcmJppSHh
        tHrWmrdzzdHflmHmHrSmqswlqhqNgssMhGgghssn
        pJcCBPPQPCcPpRpgwZNZBMnDhMsMBw
        RJCvRRVcQpjLpCJPWrftWvSnrFffWbrz
        jzlwwzDzTlQftzlWjfrBGBgVHBgpgBtPGVtP
        vhsshbMbNhZpgZrrrpHcZr
        qhdMqqSLSSbSJMqqSwwjzFzmjFQQFfHzLQ
        gDhHNnphPPPNCprHFhHFdbdczzjNqbzjVcdbQTcc
        tVJWBtVVZRWtjQbctjqcdj
        RfvlGLvLLLlLMZBmZBRhHDVPnVHPHCgFCnhlpn
        RFhZFTZvFdjlqqlRNCPwSSPCNPBSwC
        spHGswpnWgJLLJCPGg
        cWpDrVVbWfWbVfbsdQqcQzjjzlhdwqll
        WWJPpQwWdQQPNpQvqlvvCblbvbvwLL
        cmRMBMBTbSrTDRMcGBscTGfLZfvfvsCqhLlChZlLhfsC
        TVbzGSMGVVgdpdPJpQ
        lwsFfsZWGsGmsnlGQcPdBBdMbcPHfcCN
        RVvSLtSTrTVrTFPcBdCHRcPHbNNb
        LrqzLFTLrgSJLLLtTgJjVJvWlDDnjDWnWWlhlGWGhZWZhn
        GQJCMGbrMbbCGrrGtcwhctGjNSvWpVVVRjNJqVqqBBRRJq
        ssnglHHsnHzFmHnzHFPVDDSDRgVjvWDNpSSNpB
        PZfHmndFzzfPZPZfCdwchwGcbwwhCdMW
        DRGVQGmGQVnnGVmnnFpNbzCNRbRttCbpLztC
        qdqHBdjTqPlcTchBjJMvvvLtLCcLggLvtmgb
        fqhlHjdwqjjJTwldDmDmrGrrWFrDGZwD
        wFscLVLrrVhwWgZPrcswgZWFTnQdtTMnpQtjdpqdqvqQMt
        JRbHmmbDDSzDmDNpTnBBdpMHQtqtvp
        JmCCbvRGzbbGJsLgZsVhgLwwGW
        WDQwsBzWbBlMjdVpzTJVMj
        fncRngntnPCpJgmdFpFWgm
        RGZPZtZCfvWSvRZGSLvPccHwsrHbwHLrwHHQQsBDbllB
        PlNZhwgpppccgrqVvttbBfrlls
        CznSDDdHDRnRStVsVfDvfrtDZq
        QCddZFSFLTmccQmw
        rnwfVnclGPPFfSPSqBWZvvBBWqZvqWFh
        zLgLQgJssspmQTJmsgjZNmqqzqdHbthDdDDWHbhqBBqb
        QgmmjpNgCCZpjJLpmTrfrSrVRPfnrClfPwnS
        zDzPPwvwqvPPBqjnqvDqBffSfcSNJpNVfccLLNffBR
        MdTMZbgbmmTWGGdmssRCSNsSNVVVcJsNppsC
        MJghbhHhbtMMdWhbJhHgdmWvnFzHDQPDjQDvHHwvQwvzwF
        gGbqqRDrqDMdcBpVlpMG
        WzhPCnWfqMcpBnnNLZ
        fCqPHHJCfJhStwhWHbrrgvjFgbQbSbmbQs
        fhcchnSpfsNpjVVqnqjrGHqq
        zzlFLlPLWdggFqRBjqsrHrBTzz
        FDwgFLZWlbbchpwshsCNcw
        CmPlqqRJDHRDDsFv
        MfSpBQQNNfBfrfVZsmVVdzzrHZmH
        QSBSLSgmQBmwPCtgClhjPP
        NPNsHHHNsPsvHwDqgpwlqt
        rTRWSRrWRzgTzZrRVVLRQzjpbtmmGLlGDDbDwwmtblvDvw
        nRzSRrjSVRrnjrgZfrfzNdPdMPBfBMhJhhBcPhcJ
        LLhzQSDHDHNpNzHHJBQBMvMBqBRJBBqw
        rmbdtmlWCCMnvJrn
        FTVdmVgtjdtbWsvjjmdLSDcgHpDzShzDLPLSHh
        VFFJQVWHtQVHHWbJRRRHwqPvpMLpLZZWLwlwMllL
        jsngsdGssLvlqnZqZw
        hhmfDjDsmDNjjNRNVqNVJRtQHJ
        jvTnffrgFTwvqMzqGdMMSW
        sPbCtCCQQLffZGdWNLWDDzLzGM
        PQPBBtfZCZsmJPPplwwmTwpcTcmcgj
        NBmBRCCsBTRNTndGdswnlwvwnw
        fvbqrbPLqpGwScGGwbbb
        HJDPJFJLJtpJHCvCFBBBBNNWvF
        HJHgNQJBSlRRbJDRDb
        RptsfnshscWMLMZDZp
        njmrnPznnsTRTtPzFzRTswgQwqvVVwBNwwvjqCHqHq
        CBMgBJCTNgQcsQspPpWjRrWrsWsn
        mwLvHLGbdHbGzSHmvmvHzrhjjjPptjWGqZPPZhPRWWGP
        vbbrLFwLFDJFDfFN
        TnPvZSnQgQPHnnnQvgMSWppWNfWRpWfMtthMNDhN
        wLJmLBmGFBFdLBbCBbVCVlsGsWhtHqthRRhqhtHHGqqf
        LmHLbCjjBLVZzZSgzQgjrc
        wdSwfpBhtFbStpftjSVhBwFrGrsQnQgnGrQmqCPmDrmmDb
        zJvzLJLNZNscLzNHHLrGPvGGPrDDqGgDPDgC
        RWsNNRMsHTHLHTlMczLHZLWtpFwfpthSjFtwFhjSVplwtj
        QbrBDLGGRJMQJQJDbQbGvNscWNnTdvnvtnLcccvl
        fqZgpVPZHPmfgPPjBFgcscvNNccdddtdNvdFTs
        CgPpghfjjPgVmfBMMCRJQQJzJBwM
        jLWDqLdWdwLfHwJwzSSfwS
        gCgRRltMrlrCcCMzcBSVfZQfVNZNVSBVNNNh
        gMrcPntccGgzgTMlMPrtDWFvLqqdLnDsmLLFFqvp
        ttHJNccRRwmnsnHnHWMSwqfgvgfwSQZfQf
        ShpLhhzTPBMpQqQgvM
        zhbFjVdrjFjVljrVbdPddSTPHNssHnHlRNCHtRtsctJtGsRJ
        zMVTscVhQhGGhClv
        LfMJmgSBpLRfHmBPgpmJPSBdvQNtlHvrHvNNtNNNClGdGN
        JFJmmSFFbFFbRJPBgFPmSBPMzzWWTDjjTsTqqwjVWbjjVVsZ
        HZpCnwnggfFggbgLDcTb
        SjvWjGzNGGzRjSGmMcLhvhMhFMCcmv
        rjrVJNjVrzVNPrwtPwPCHBPB
        SWwFbTzsSjPzpjFbsWPTWTcWLCLgLgLBZjGVDjCVBBgCBGCZ
        lrJJttQcHqrHrvggHVBgBLffBC
        lnhhcqNRJWzhTdsWFz
        vzldvzlclbFjFvmtjZ
        DDNMNStMsSsGnhSMwQjTQVgVbwMbVTTQ
        DsDSCNNGpLtsNLpnNsqLppDzCBcdJHBzllcJfzJBPBdBlR
        qWNfDvffbJBFDpNfmpbwhGhwjLgTrGwhbGGwrj
        ZctMVCcVVQtTpthlnLtppw
        QMcRSPMZcpCZqDFNRFHNJFFF
        RmztpGSssNMzJRpCvqsCrqdHCBlBdw
        gffPFDcqVbgqWgjlPlwCCrdBdllnBH
        cFFZcbcqfQhgbcNJZRSMRtmNJptS
        PZthPBWlPNPSPtmHHggFGgBJJbwg
        qqzDvLLrfDpvvDLzqvnLzqpzbrCRGJRHwFCmHRwGwgwbbRCj
        nnpnMfpMLTVqfmthmsMNSScMhS
        dflvbdvpfffzpnNLNbWqtblqHjmVhVRhHrwrwrswhHnjsmwh
        gSGMdMcJBgMTGPSPDVZhHhHZmDZhrwwjVm
        CPJQGBGGPcSTFcTCScFtLLdWvptWLbNpNzvWQL
        WThqhvvRDJDRhwcrscNDNFgDHNct
        fnrZVnfVjrSGGLzZbnLzZLjVHstHHHQtgQbPpPcpHsscsFpN
        SVjZSzZdndVCdSSZmTRvMWBRWvvWlrvmhJ
        BcllhPPmMMBPcbRwgQtgHHgtmwgzmt
        rpLqbrbTnNvqjLqLNqrNLvHzDtwpDCzFwggttFFHCQFQ
        LrrrNLqjZSTsZZsvjbLjPhcBBlBsBcGPPcPlPVGP
        HHhrggvSHDtCDsfF
        ZMpLblppNZBDBwLzLLpMssCntfWdCFCnfCCtRNtq
        lbmJlzzLMPMmlBzhSJVccSJhTvSTDh
        sdjBBFqHscFnHTzCnRSnzgVTlC
        LpWWtvZfrpbLpZpWftprLCCNMzCZMmmzTNNTmSSVSM
        pLVtrtbGvpbpGLfPddHBscBQJJGcwsQq
        hLcLnVVcfQBLZPVZnThfVVmjqjHNjgvNfdvpNdrrvvfp
        lbRlWFHJtGNGpqmrqrCN
        DzRRDFsbDtFtDJtWRztzJZVBQMhTsLhQZMZHVLcLcP
        WgbdmgMmWDDvcPcpbz
        jffpllHSpHRptRRGRntSVwvLSCCJDzcCcDLvCzPP
        tRFrnlGfZrQpBpgQQsgF
        TpbBZbCCHCGZNHbzGqgFdNlcFSdNlStSqg
        wvWnWwLCPjJPJhMWtWdMfFSMgcdM
        hhmvmJrJLJJJPvvhDjswCRGHHrHzBBHGVRQBzRRQ
        zChCSBbpSsQscDHHQh
        LNJJRgGltJDvfcrfgHfZ
        lJNRGlLnNJtTGVMlFTbwSWqjBbzWWHSW
        NDTJQDVwCTCJhVGDLfbBbBfbGqbfHBfBHb
        lMgMrggMrmmtzMcgWdlmMlbsRjSRBsTRBWsSHSBTHRBj
        cMPlgztzrPMznnMPpgddgdzpwDDNNwhNFCTwNZQFLTVTwV
        ZgshQgzQnnwMtDwBwv
        SFWFlFZRRcmlWmWRBCDwvwwftBtLmfLf
        PjRFdTdWGddrGlPjcsJZpJzTqhzQJzNHhz
        PgHQgddszgdGPWpMjljMcj
        bSqTqnZLnDJSmnmZmtllGsnVtnWjGGWtjl
        fqSLDbRSfBdHsRwsFdHd
        RwHWZpCWhHvwvHCBMBpJMJGPJJnJgc
        lztljTFljRRBBzBnBMnJMS
        QbRljFtQfljbbFqNFrdZVrZfdCCwVwvddH
        sHzztVzLTgnssPggHHsnCtzBmfBMrMccBBmqmrBqBCRqMf
        ZhDQJhFDqjmSMrRF
        dZpwDhNhhZpQJdDQpwnsGttGwLtRRTLRts
        QJNhClVgPTTtPNCJJCtJhlNPZZRVZfvfzZzmvvzvsmZsvmzR
        blBWBpdbLBDqBpszzffRsvdzjvvd
        BLWpqBbqnDHqBbGlnWGBPcPJcHTTPrhtgNtCtgPc
        jWVJqVwgsJcHCVlQVVQNBp
        vGhGhTPtSSNCddSBCH
        ZCCDtbDftZsqrrcnWW
        hJThjThhVzVTZZwnNZRdgmzt
        lrbSSddsrbPQpsvNtgPRmtHmvtnR
        GQrspWdSGbDcsFFLBhCGVBjhjj
        rHdlHdZDlTcflcNfcrCgcTWWpWQFsRWsFjRCsCjWCmhF
        BnqbvQPLGLBPwqGmsVshsSWShGms
        PzzPPQJPMJtJbbznPnDdrHlNldDNltrgtfDg
        SmmMQhPSlmTwPpmnpllMSMPrccFDqFrDFGgqrDcCwfDgwq
        bVdLLNvdQWVbJbQLVGfGDGfDgrFrqgqJgg
        vjjWsbQdBsszhsHlhhPPSHsM
        PqzJqNzsJgsgNqPdLJPPPNVpMMVWGlFWNFGMpWppGF
        ZnZBjttQZcQZRTQDjQwGFlWMlGdGWVrWWlGn
        ZRDBRSZDSdSLsqJHfSbzzL
        rljJqtZlJqlJcvBNJBNQfQ
        TVMWznvPMTFWznwPFFvwFbbBNBgbcNpQdNcBFQpb
        mDnLWsPLvLMnnnmTzLzVCtlRRtjSljCZhDlhtqSq
        fgWMHClGMWfgRWWWGCfmfgCSVQNTDFHTtddVQQDZNLDZtVVL
        wSqbsvzpwpbpdFTNLQwLNTFN
        zscjPnPqsJlmPJCJSC
        GZSwQjGwGrCGwrTjdCTwdTBpqqlmNmVpNrNvplJqNNpl
        zMfJnDcbRRDRFbzDFRLFBtqNmqqtNBmNBvNm
        sHcJRRHzzfQTjjCjQjCH
        wJCVVbJgCLCwGsMbbGTlsRWHsztZPZWtPrPrWrHzrz
        DBqdvfqDBqFpWZFrtppZJp
        djqNfQcjDQjMgbbwLjlJGn
        TSwfZMfpQwcCCCCrbbCZ
        PLJmGJnjqjrsCjMMVj
        LnNNLLLnFFWmLFMGNMDgfRpDQSfwSfgQzBHwTS
        CdjNCMmdCrVmCjJdVjFNMtMzhWwpGbpBhPZZZDbGPpDhpr
        QSfHzlvgTQffSSHHclgfHnqPbPPPppBhpWDhwWvPhvbwwh
        cQfQRgQnQsnsQSgHRQJsCFMsCjLzJJFjCdNC
        ltLlJttmQdfVRhNmhB
        gWWDrPSvCSWgMMMZBVBdTQPQZNZVPR
        vCbwQzcQrCrLFHwJpHHGpp
        VbRVvVHRbJVTzVLBVPtt
        cSdgSZSZZFhnFcFwdDQcZZhgzpTlzLDzlWTvBWLztBtpLplT
        hZZvdrcSZQZSSwncdHCqHmGHqJrCJqbNbq
        lwWmsQlDbCZbVWZq
        rRShhhhPjTsjTRvHhqfzqfqvBZZvBCZffC
        scPThhRSjQmmNpplcg
        FChtDTThDqZtjppjvgNvjl
        LBwsVdVHLVvvpVGjjgjS
        BbHLBfRcsHcBdMbdWJQPWFCQCZZhWrJPQp
        zMtWCstzNrQLpbplFwQwhb
        gDTDHGvvHVfVdGZVJGDGdnmbwmWFwfhpbnfjwwjpLl
        GJcHVJdvZJVGZWHSSvTZMCzrzzRNSBtBNPBMqNBB
        pLzZVVGGZmZVlmDsQglgsllc
        WSvrjRjrMMFFnFjnrnrdjBRRgdsblQQPbpggsclNDDbPstDs
        SMWRBrrrvSRBSSvWWWBTMTCqpZzLCCTCwJZwwzGZzqHL
        TvfGwGZpPnSNgSSnGh
        srLVHLcjsjVtHqjjrjFjcCqPBggqNQQnMqhgngnznNNB
        VtdmPHLmtVHFLdmZWRJlWpWWWlmWfp
        SbSbdTsrVrdhfSdDGJWGmNwWWPwTGP
        BqlRpBMmllpmnpvvDJPZWPJwZcJgDD
        FFRMCnRFtCMRlMplqMBRBppVbtzdrdhssrmHzVVSsVhVHz
        dNrhhLsrshSmmRcPhm
        WMCngCzCvzvMMpplQvzWlRBPcVStSmTSQbbVSPQmwm
        MpzvWnllglJfqfMgsNdZHqNjdDsPHqqZ
        rNvGZRsRcRRBtBCttB
        DwPPQWnWWnPQnJlPhmTtBFBmqzhpmnFh
        QwQQQlbPPMWwDdDwlVDJJPPdvdSjrjdrsgssLLsZLNBrNNNr
        VjMMVzngnjQQfJDchZqGNqFPcg
        SWBwTtWSFTHwFClHHmwBPcJJDhNGPJNPPhPPGhJt
        CBvSBBBWHdmRTvRWRQFLQRnjnfLLzVbs
        flSpvLlmZpCpZmVSBtlvHHjFHTdssZdjHFdTWdNh
        RmQMQJRQJQmPgrzJrPcRQRJcWdNTGTGGFhGTdFhHThHGMTsF
        RzJrqqcqPRqqJDDqttCpmtlwBpDflSLt
        hBjPZbPBbWvTRnLRWntD
        MNGQNsQwfzsdGfgTGfzQwwffmnCRDVmJLRLCvnvLDvJCDgRL
        wTTdFldNHzTMljjFqphrBqhrZb
        wDcMCbZbzPDcZDWQdrJLrQrZBLRBQr
        FFSHStjtHgllgFdSNmlfFStBqRRssRsRJrLrjrrJBRVhLJ
        fGggtfHtgWMwbCGdCT
        RQrQDDbVGrRSfbVbGtmGtwHFWsCCzsJSJJHsJPJvWC
        hphQnhZQNjlBBcMMpCsHwFjvvHWHWsFvjC
        ppcnnBZqllTQfmrffbtGTDGt
        dsDFsBZBhCFhshFrpBFnmLQmHmRgRbLqmmmRQDLm
        PPBBNNNtGTwJNfTJffNttfLQgqLgHvHbqRwlgmblRvll
        NSNTGTJTWPjGWMPSJJzrBSpzdFSddCFdncrs
        bPzRlMPTzTMldJMnhswcjzfQVccQhc
        HCCqNmNmQQmQssJn
        pHptprtgRStTtMJt
        nTmhrsPMsTfmHHGcSgtj
        bJJwdlrJQLlvwlQDDwSbgffGVNjfgjNtVbcf
        QlpDQFJdvdFqJdFpLvDFpLLnzZMnBMRRzMTqnrzqTRPznz
        qRVRqBzgwqRpqRgVqQRPpQJJPrPhPGJnsGrCFdFJrZdG
        ZvWDmMvmSvCndssrsJ
        WcZcNWlcMjBQpzNTqVBp
        DpLPZLDDlcgmDmhVgfgfWWRwhwwt
        VrVMdbCrrBTjCMQQtMwQNSqMQW
        VCBHdJHdvrrFsbsdrBJTdTzZcpmZGDGPlmzmlccFDZDn
    """.trimIndent()

    fun process1(data: String): List<Pair<String, String>> {
        return data.lines().map {
            val middle = it.length/2

            Pair(it.substring(0, middle), it.substring(middle))
        }
    }

    fun work1(data: List<Pair<String, String>>) {
        val commonItems: List<Char> = data.map {
            val first = it.first.toSet()
            val second = it.second.toSet()

            first.intersect(second).first()

//            try {
//                first.intersect(second).first()
//            } catch (e: Exception) {
//                println("Oooops at $it")
//                '1'
//            }
        }

//        commonItems.forEach {
//            println("$it prio ${itemCharToPrio(it)}")
//        }


        val commonItemPrio = commonItems.map {
            itemCharToPrio(it)
        }

//        println("The following items are in both compartments for the test data: ")
//        commonItems.forEach {
//            println("$it")
//        }
        println("Sum of all common items prio value is ${commonItemPrio.sum()}")
    }


    fun process2(data: String): List<List<String>> = data.lines().windowed(3, 3)

    fun work2(data: List<List<String>>) {
        val commonItems: List<Char> = data.map {
            val first = it[0].toSet()
            val second = it[1].toSet()
            val third = it[2].toSet()

//            first.intersect(second).intersect(third).first()

            try {
                first.intersect(second).intersect(third).first()
            } catch (e: Exception) {
                println("Oooops at $it")
                '1'
            }
        }

        commonItems.forEach {
            println("$it prio ${itemCharToPrio(it)}")
        }

        val commonItemPrio = commonItems.map {
            itemCharToPrio(it)
        }

//        println("The following items are in both compartments for the test data: ")
//        commonItems.forEach {
//            println("$it")
//        }
        println("Sum of all common items prio value is ${commonItemPrio.sum()}")
    }

    fun itemCharToPrio(c: Char): Int {
        val cInt = c.toInt()
        val lcInt = 'a'.toInt()
        val ucInt = 'A'.toInt()

        return when {
            cInt > lcInt -> cInt-lcInt+1
            else -> cInt-ucInt+27
        }
    }
}